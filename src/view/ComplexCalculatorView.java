package view;

import model.ComplexNumber;

import java.util.Scanner;

public class ComplexCalculatorView {

    private Scanner scanner;

    public ComplexCalculatorView() {
        scanner = new Scanner(System.in);
    }

    public ComplexNumber getComplexNumber() {
        System.out.print("Enter real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void displayResult(String operation, ComplexNumber result) {
        System.out.println(operation + " result: " + result);
    }
}
