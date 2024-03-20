package view;

import model.ComplexNumber;
import model.util.Operations;
import view.util.CommandsView;

import java.util.Scanner;

public class ComplexCalculatorView {

    private Scanner scanner;

    public ComplexCalculatorView() {
        scanner = new Scanner(System.in);
    }

    public CommandsView getCommandsView(){
        System.out.println("Choose command: ");
        System.out.println("1. Start calculations");
        System.out.println("2. Exit");

        int command = scanner.nextInt();
        switch (command){
            case 1:
                return CommandsView.START;
            case 2:
                return CommandsView.EXIT;
            default: throw new IllegalArgumentException("Incorrect command");
        }
    }

    public ComplexNumber getComplexNumber() {
        System.out.print("Enter real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public Operations getOperation() {
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return Operations.ADDITION;
            case 2:
                return Operations.SUBTRACTION;
            case 3:
                return Operations.MULTIPLICATION;
            case 4:
                return Operations.DIVISION;
            default:
                throw new IllegalArgumentException("Incorrect operation");
        }
    }

    public void displayResult(ComplexNumber result) {
        System.out.println("Result: (" + result.getReal() + ", " + result.getImaginary() + "i)");
    }
}
