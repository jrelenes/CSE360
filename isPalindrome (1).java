package Palindrome;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class isPalindrome {
	
	@Test
	void testPalindrome() {
		
		Palindrome test4 = new Palindrome("ffdvdfvdf");
		boolean result4 =  test4.isPalindrome();
		assertEquals(result4, false);
		}
	
	@Test
	public void testPalindrome1() 
	{
		
		Palindrome test2 = new Palindrome("h1anna1H");
		boolean result2 =  test2.isPalindrome();
		assertEquals(result2, true);	
		
	}
	
	@Test
	public void testPalindrome2() 
	{
		
		Palindrome test2 = new Palindrome("1001");
		boolean result2 =  test2.isPalindrome();
		assertEquals(result2, true);	
		
	}@Test
	public void testPalindrome3() {
		Palindrome test1 = new Palindrome("Red rum, sir, is murder");
		boolean result1 =  test1.isPalindrome();
		assertEquals(result1, true);
	}
		
	@Test
	public void testPalindrome4() {
		
		Palindrome test3 = new Palindrome("ffdvdfvdfv");
		boolean result3 =  test3.isPalindrome();
		assertEquals(result3, false);
		
		
	}
	
	
	
	

}
