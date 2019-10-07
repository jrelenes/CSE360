package cse360assign2;

public class main {
	
	public static void main(String[] args)
	{
	
		AddingMachine myCalculator= new AddingMachine(5);
		
		myCalculator.add(10);
		myCalculator.subtract(5);
		myCalculator.add(10);
		myCalculator.add(3);
		myCalculator.subtract(4);
		myCalculator.toString();
		
		
		myCalculator.getTotal();


	}
	

}
