package moneycalculator;

import controller.MoneyCalculatorController;
import model.MoneyCalculatorModel;
import view.MoneyCalculatorView;

public class MoneyCalculator {

    public static void main(String[] args) {
        MoneyCalculatorModel model = new MoneyCalculatorModel();
        MoneyCalculatorView view = new MoneyCalculatorView();
        MoneyCalculatorController controller = 
                new MoneyCalculatorController(model, view);
        view.setVisible(true);
    }
    
}