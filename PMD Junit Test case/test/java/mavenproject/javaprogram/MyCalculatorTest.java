package mavenproject.javaprogram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class MyCalculatorTest {
  MyCalculator calculator =null;
  
  
  @Before
  public void initialize() throws CalculatorException
  {
	  calculator= new MyCalculator();
  }
  
    @Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
   /* @Test
    public void testPower() throws CalculatorException
    {
    	calculator.power(2, 3);
    	assertEquals(calculator.power(2, 3),8);
    	
    
}*/
     @Test(expected=CalculatorException.class)
     public void testpositive() throws CalculatorException
     
     {
    	 
    	 assertEquals("n and p should not be zero",calculator.power(0, 0));
    	 
     }
     @Test(expected=CalculatorException.class)
     public void  testnegative() throws  CalculatorException
     {
    	 assertEquals("n and p should not be negative", calculator.power(-1, 2));
     }

}
