package mavenproject.javaprogram;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndexTest {

	@Test
	public void testIsDublicate()
	{
		Index index=new Index();
	assertEquals("true", Index.isDublicate("apple"),"true");
	}
	
	@Test
	public void testFail()
	{
		Index index=new Index();
		assertEquals("false", Index.isDublicate("abcf"),"false");
	}

	
}
