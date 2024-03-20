package controller;

import model.ComplexNumber;
import model.repository.impl.ComplexCalculator;
import model.util.Operations;
import view.ComplexCalculatorView;
import view.util.CommandsView;


public class ComplexCalculatorController {

    private ComplexCalculatorView view;
    private ComplexCalculator calculator;

    public ComplexCalculatorController(ComplexCalculatorView view, ComplexCalculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    private void performCalculation() {

        System.out.println("Please, enter first complex number");
        ComplexNumber num1 = view.getComplexNumber();
        System.out.println("Please, enter second complex number");
        ComplexNumber num2 = view.getComplexNumber();
        Operations operation = view.getOperation();
        ComplexNumber result;
        switch (operation) {
            case ADDITION -> result = calculator.add(num1, num2);
            case SUBTRACTION -> result = calculator.subtract(num1, num2);
            case MULTIPLICATION -> result = calculator.multiply(num1, num2);
            case DIVISION -> result = calculator.divide(num1, num2);
            default -> throw new IllegalArgumentException("Incorrect operation");

        }
        view.displayResult(result);

    }

    public void startingWorkCalculator(){
        while (true){
            CommandsView com = view.getCommandsView();
            switch (com){
                case START -> performCalculation();
                case EXIT -> {
                    return;
                }
            }
        }
    }


}
