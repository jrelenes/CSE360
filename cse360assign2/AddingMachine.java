package cse360assign2;

public class AddingMachine {

	private int total;
	private String total_string;

	public AddingMachine (int value1) 
	{
		total = 0;  // not needed - included for clarity
		total_string = "0";
			}
	
	public int getTotal () 
	{
		System.out.print("\n");
		System.out.print(total);
		return total;
	}
	
	public void add (int value)
	{
		total=total+value;
		total_string= total_string + "+" + Integer.toString(value);
	}
	
	public void subtract (int value) 
	{
		total=total-value;
		total_string= total_string + "-" + Integer.toString(value);
		
	}
		
	public String toString () 
	{
		System.out.print(total_string);
	
		return total_string;
	
	}

	public void clear() {
	
	}
}

