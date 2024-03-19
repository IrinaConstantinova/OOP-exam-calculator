package controller;

import model.ComplexNumber;
import model.repository.impl.ComplexCalculator;
import view.ComplexCalculatorView;

public class ComplexCalculatorController {

    private ComplexCalculatorView view;
    private ComplexCalculator calculator;

    public ComplexCalculatorController(ComplexCalculatorView view, ComplexCalculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void performCalculation() {
        System.out.println("Enter first complex number: ");
        ComplexNumber num1 = view.getComplexNumber();
        System.out.println("Enter second complex number: ");
        ComplexNumber num2 = view.getComplexNumber();

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber difference = calculator.subtract(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        view.displayResult("Sum", sum);
        view.displayResult("Difference", difference);
        view.displayResult("Product", product);
        view.displayResult("Quotient", quotient);
    }
}
