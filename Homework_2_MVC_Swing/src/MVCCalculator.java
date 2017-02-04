// Programmers: Dalton Lobosky and Jason Beard
// Class: CS5101
// Homework 2

public class MVCCalculator
{  
    public static void main(String[] args) 
    {
    	CalculatorView theView = new CalculatorView();
    	CalculatorModel theModel = new CalculatorModel();
        CalculatorController theCtrlr = new CalculatorController(theView,theModel);
        theView.setVisible(true);
    }
}