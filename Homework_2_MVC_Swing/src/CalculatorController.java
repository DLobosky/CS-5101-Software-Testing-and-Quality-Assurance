// Programmers: Dalton Lobosky and Jason Beard
// Class: CS5101
// Homework 2

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController 
{
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) 
	{
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListenerAdd());
		this.theView.subCalculateListener(new CalculateListenerSub());
		this.theView.multCalculateListener(new CalculateListenerMult());
		this.theView.divCalculateListener(new CalculateListenerDiv());
	}
	
	class CalculateListenerAdd implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			int num1_add, num2_add = 0;
			
			num1_add = theView.get_num1_add();
			num2_add = theView.get_num2_add();
			
			theModel.add(num1_add, num2_add);
			
			theView.set_ans_add(theModel.getAddAns());			
		}
	}
		
	class CalculateListenerSub implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			int num1_sub, num2_sub = 0;
			
			num1_sub = theView.get_num1_sub();
			num2_sub = theView.get_num2_sub();
			
			theModel.sub(num1_sub, num2_sub);
			
			theView.set_ans_sub(theModel.getSubAns());			
		}
	}	
	
	class CalculateListenerMult implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			int num1_mult, num2_mult = 0;
			
			num1_mult = theView.get_num1_mult();
			num2_mult = theView.get_num2_mult();
			
			theModel.mult(num1_mult, num2_mult);
			
			theView.set_ans_mult(theModel.getMultAns());
		}
	}	
	
	class CalculateListenerDiv implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			int num1_div, num2_div = 0;
			
			num1_div = theView.get_num1_div();
			num2_div = theView.get_num2_div();
			
			theModel.div(num1_div, num2_div);
			
			theView.set_ans_div(theModel.getDivAns());			
		}
	}	
}