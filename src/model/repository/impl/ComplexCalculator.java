package model.repository.impl;

import model.ComplexNumber;
import model.repository.Calculable;

public class ComplexCalculator implements Calculable {


    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImaginary() + num2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() - num2.getReal();
        double imaginaryPart = num1.getImaginary() - num2.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        double divider = (num2.getReal() * num2.getReal()) + (num2.getImaginary() * num2.getImaginary());
        if (divider == 0){
            throw new ArithmeticException("Division by zero");
        }
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / divider;
        double imaginaryPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / divider;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
