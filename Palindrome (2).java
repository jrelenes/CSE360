package Palindrome;

public class Palindrome 
{
	//instance variable
	private String data;
	boolean logic= true;
	
	//constructor
	Palindrome(String dataC)
	{
		//links dataC to internal variable data
		data=dataC;
		//converts data values to lower case
		
	}
		
	
	//evaluates a v=boolean expression returns true or false 
	public boolean isPalindrome()
	{
		//position at beginning of string
		
		//position at end of string
		int j=data.length()-1;
		int i= 0;
		//initial condition is set to true to enter loop and will only iterate to half the size + 1
		
			 while(i<j   || logic==true)
			 {
				 
				 // if i is not digit or letter
				 // 
				 if(!Character.isDigit(data.charAt(i)) && !Character.isLetter(data.charAt(i) )              )//i
				 {
					 i++;
				 }
				 //decreases position
				 else if(!Character.isDigit(data.charAt(j)) && !Character.isLetter(data.charAt(j))            )//j
						 {
					 j--;
						 }
				 else if(Character.toLowerCase(data.charAt(i)) != Character.toLowerCase(data.charAt(j)))
				 {	 
					logic=false;
				 }
				 else
				 {
				i++;
				j--;
				 }
				 }
				
			
		
		// returns the result after exiting the loop
		return logic;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
