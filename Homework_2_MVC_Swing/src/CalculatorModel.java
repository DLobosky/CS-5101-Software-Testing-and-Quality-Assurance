public class CalculatorModel 
{	
	private int ans_add, ans_sub, ans_mult, ans_div;
	
	public int add(int num1, int num2)
	{		
		return ans_add = num1 + num2;
	}
	
	public int getAddAns()
	{	
		return ans_add;	
	}
	
	public int sub(int num1, int num2)
	{		
		return ans_sub = num1 - num2;
	}
	
	public int getSubAns()
	{	
		return ans_sub;	
	}
	
	public int mult(int num1, int num2)
	{		
		return ans_mult = num1 - num2;
	}
	
	public int getMultAns()
	{	
		return ans_mult;	
	}
	
}