package mavenproject.javaprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	
	@Test
	public void TestNumber1() {
		Palindrome test = new Palindrome();
		assertEquals("true", Palindrome.isPalindrome("121"),"It is a palindrome.");
	}
	@Test
	public void testNull()
	{
		Palindrome test2= new Palindrome();
		assertEquals("false", Palindrome.isPalindrome("123"),"It is not a palindrome.");
	}
}
