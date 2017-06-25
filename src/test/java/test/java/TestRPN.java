package test.java;

import junit.framework.TestCase;
import main.java.RPNCalc;

public class TestRPN extends TestCase{

	public void testTwoValueOneOpt()
	{
		String expr = "1,2,+";
		RPNCalc calc = new RPNCalc();
		assertEquals(3, calc.Calculate(expr));
	}
	public void testTwoValueOneOptCross()
	{
		String expr = "2,2,+";
		RPNCalc calc = new RPNCalc();
		assertEquals(4, calc.Calculate(expr));
	}
}

