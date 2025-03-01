package model.repository;

import model.ComplexNumber;

public interface Calculable {

    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
