package mavenproject.javaprogram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IndexTest {

	@Test
	public void testIsDublicate()
	{
		Index index=new Index();
		assertEquals("apple",index.equals(index));
	}
	
	
	
	@Test
    public void myTestMethod() {
       Index index=new Index();
       
       org.junit.Assert.assertTrue( index.equals(index));
    }
	
}
