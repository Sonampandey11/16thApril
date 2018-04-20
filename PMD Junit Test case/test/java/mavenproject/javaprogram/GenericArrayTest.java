package mavenproject.javaprogram;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GenericArrayTest {
	//is used to initialise the 
	
	GenericArray array;
	
	@Before
	public void testInput(int number2)
	{
		GenericArray array=new GenericArray();
		Integer[] number= {1,2,3,4};
		String[]  name= {"Sonam", "Pandey"};
		
	}
	
	
	@Test
	public void testValue(String name)
	{
		/*array.displayArray();
		assertArrayEquals(array, "sonam");*/
		
	}
	
	
 
	@Test
	public void testData()
	{
		
		assertEquals(true, "sonam");
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

 
	
	
}
