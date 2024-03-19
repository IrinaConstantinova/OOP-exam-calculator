import controller.ComplexCalculatorController;
import model.repository.impl.ComplexCalculator;
import view.ComplexCalculatorView;

public class Main {
    public static void main(String[] args) {

        ComplexCalculatorView view = new ComplexCalculatorView();
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexCalculatorController controller = new ComplexCalculatorController(view, calculator);
        controller.performCalculation();

    }
}