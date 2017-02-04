// Programmers: Dalton Lobosky and Jason Beard
// Class: CS5101
// Homework 2

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorModelTest 
{
	@Test
	public void testAdd() 
	{
		CalculatorModel test = new CalculatorModel();
		int result = test.add(4, 5);
		assertEquals(9, result);
	}
	
	@Test
	public void testSub() 
	{
		CalculatorModel test = new CalculatorModel();
		int result = test.sub(5, 4);
		assertEquals(1, result);
	}
	
	@Test
	public void testMult() 
	{
		CalculatorModel test = new CalculatorModel();
		int result = test.mult(5, 4);
		assertEquals(20, result);
	}
	
	@Test
	public void testDiv() 
	{
		CalculatorModel test = new CalculatorModel();
		int result = test.div(8, 4);
		assertEquals(2, result);
	}
}