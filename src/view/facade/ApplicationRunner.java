package view.facade;

import controller.ComplexCalculatorController;
import logger.Log;
import model.repository.impl.ComplexCalculator;
import view.ComplexCalculatorView;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger log = Log.log(ApplicationRunner.class.getName());

    public static void run(){
        log.log(Level.INFO, "Method run started");
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexCalculatorView view = new ComplexCalculatorView();
        ComplexCalculatorController controller = new ComplexCalculatorController(view, calculator);

        controller.startingWorkCalculator();
    }
}
