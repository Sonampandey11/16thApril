package mavenproject.javaprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseWordTest {
	
	@Test
	public void TestRevrse() {
		ReverseWord test = new ReverseWord();
		assertEquals("elppa", ReverseWord.reverseWord("apple"),"elppa");
	}
	
	public void TestFail()
	{
		ReverseWord test2=new ReverseWord();
		assertEquals("fail", test2.reverseWord(" "),"");
	}
}

