package view.facade;

import controller.ComplexCalculatorController;
import model.repository.impl.ComplexCalculator;
import view.ComplexCalculatorView;

public class ApplicationRunner {
    public static void run(){
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexCalculatorView view = new ComplexCalculatorView();
        ComplexCalculatorController controller = new ComplexCalculatorController(view, calculator);

        controller.startingWorkCalculator();
    }
}
