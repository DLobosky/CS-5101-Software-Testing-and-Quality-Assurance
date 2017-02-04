import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorModelTest 
{
	@Test
	public void testAdd() 
	{
		CalculatorModel test = new CalculatorModel();
		int result = test.add(4, 5);
		assertEquals(10, result);
	}
}