/**
 * @param total
 * @param total_string
 * @param value1
 * @param value2
 * @author Jose Elenes
 * @ASU_ID 1206857687
 * @Class_ID CSE 360: 85141
 * @Assignment_Number 3
 * @Description calculator and is able to add, subtract, multiply, 
 * divide, take the power of a value and print the calculations.
 *  The values are returned.
*/

/**
*this is the name that was asked to be changed from
*an earlier package from assignment I.
*/

package cse360assign3;

/**
 * This class extends addingMachine. This uses
 * the second assignment for CSE 360 to extend functionality.
 * @author Not-yours
 *
 */

public class calculator extends addingMachine 
{
	
	/**
	 * creates a constructor class named calculator 
	 */
	
	public calculator ()
	{
		
		/**
		 * the total is initialized for the function
		 */
		
		total = 0;
	}
	
	/**
	 * the function takes a value and multiplies total by the value
	 * @param value
	 */
	
	public void multiply (int value) 
	{

		/**
		 * the total is multiplied by value and is equal to itself times the value
		 */
		
		total *= value;
		
		/**
		 * the total string is added the multiplied value creating a larger string
		 */
		
		totalString = totalString + "*" + Integer.toString(value);
	}

	/**
	 * this public function takes a value and divides it and keeps the largest prime number
	 * the function rounds to a whole prime number
	 * @param value
	 */
	
	public void divide (int value) 
	{

		/**
		 * if the value is zero then the total is zero
		 */
		
		if (value == 0) 
		{
			
			/**
			 * the total is equal to zero
			 */
			
			total = 0;
		}
		else 
		{
			
			/**
			 * the total is equal to the total divide by the value
			 */
			
			total = (int) total/value;
			
			/**
			 * the strong is concatenated with the value.
			 * the value is converted to string
			 */
			
			totalString = totalString + "/" + Integer.toString(value);	
		}
	}

	/**
	 * the function raises total to the power specified value
	 * @param value
	 */
	
	public void power(int value) 
	{
		
		/**
		 * if the value is less than zero then total
		 * is set to zero
		 */

		if (value < 0) 
		{
			
			/**
			 * total is initialized to zero
			 */
			
			total = 0;
		} 
		else 
		{
			
			/**
			 * total is equl to total raised to the power value
			 */
			
			total = (int) Math.pow(total, value);
			
			/**
			 * the total string is increased to keep a record of calculations
			 * for the power function
			 */
			
			totalString = totalString + "^" + Integer.toString(value);	
		}
	}
}
