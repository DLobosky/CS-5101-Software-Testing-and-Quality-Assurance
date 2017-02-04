import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame
{
	private JTextField num1_add  = new JTextField(10);
	private JLabel label_add = new JLabel("+");
	private JTextField num2_add = new JTextField(10);
	private JButton equals_add = new JButton("Equals");
	private JTextField ans_add = new JTextField(10);
	
	private JTextField num1_sub  = new JTextField(10);
	private JLabel label_sub = new JLabel("-");
	private JTextField num2_sub = new JTextField(10);
	private JButton equals_sub = new JButton("Equals");
	private JTextField ans_sub = new JTextField(10);
	
	private JTextField num1_mult  = new JTextField(10);
	private JLabel label_mult = new JLabel("*");
	private JTextField num2_mult = new JTextField(10);
	private JButton equals_mult = new JButton("Equals");
	private JTextField ans_mult = new JTextField(10);
	
	private JTextField num1_div  = new JTextField(10);
	private JLabel label_div = new JLabel("/");
	private JTextField num2_div = new JTextField(10);
	private JButton equals_div = new JButton("Equals");
	private JTextField ans_div = new JTextField(10);
	
	CalculatorView()
	{
		JPanel rootPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 175);
		
		rootPanel.add(num1_add);
		rootPanel.add(label_add);
		rootPanel.add(num2_add);
		rootPanel.add(equals_add);
		rootPanel.add(ans_add);
		
		rootPanel.add(num1_sub);
		rootPanel.add(label_sub);
		rootPanel.add(num2_sub);
		rootPanel.add(equals_sub);
		rootPanel.add(ans_sub);
		
		rootPanel.add(num1_mult);
		rootPanel.add(label_mult);
		rootPanel.add(num2_mult);
		rootPanel.add(equals_mult);
		rootPanel.add(ans_mult);
		
		rootPanel.add(num1_div);
		rootPanel.add(label_div);
		rootPanel.add(num2_div);
		rootPanel.add(equals_div);
		rootPanel.add(ans_div);
		
		this.add(rootPanel);		
	}
	
	public int get_num1_add()
	{
		return Integer.parseInt(num1_add.getText());
	}
	
	public int get_num2_add()
	{
		return Integer.parseInt(num2_add.getText());
	}
	
	//public int get_ans_add()
//	{
//		return Integer.parseInt(ans_add.getText());
//	}
	
	public void set_ans_add(int ans)
	{
		ans_add.setText(Integer.toString(ans));
	}
	
	//-----------------------------------------------------------------
	public int get_num1_sub()
	{
		return Integer.parseInt(num1_sub.getText());
	}
	
	public int get_num2_sub()
	{
		return Integer.parseInt(num2_sub.getText());
	}
	
	
	public void set_ans_sub(int ans)
	{
		ans_sub.setText(Integer.toString(ans));
	}
	
	//-----------------------------------------------------------------
	
	public int get_num1_mult()
	{
		return Integer.parseInt(num1_mult.getText());
	}
	
	public int get_num2_mult()
	{
		return Integer.parseInt(num2_mult.getText());
	}
	
	
	public void set_ans_mult(int ans)
	{
		ans_mult.setText(Integer.toString(ans));
	}
	
	//-----------------------------------------------------------------
	public int get_num1_div()
	{
		return Integer.parseInt(num1_div.getText());
	}
	
	public int get_num2_div()
	{
		return Integer.parseInt(num2_div.getText());
	}
	
	
	public void set_ans_div(int ans)
	{
		ans_div.setText(Integer.toString(ans));
	}
	
	//-----------------------------------------------------------------	
	
	void addCalculateListener(ActionListener listenForCalcButton)
	{
		equals_add.addActionListener(listenForCalcButton);
	}
	
	void subCalculateListener(ActionListener listenForCalcButton)
	{
		equals_sub.addActionListener(listenForCalcButton);
	}
	
	void multCalculateListener(ActionListener listenForCalcButton)
	{
		equals_mult.addActionListener(listenForCalcButton);
	}
	
	void divCalculateListener(ActionListener listenForCalcButton)
	{
		equals_div.addActionListener(listenForCalcButton);
	}
}
