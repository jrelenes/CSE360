/**
 * @param total
 * @param total_string
 * @param value1
 * @param value2
 * @author Jose Elenes
 * @ASU_ID 1206857687
 * @Class_ID CSE 360: 85141
 * @Assignment_Number 3
 * @Description addingMachine and is able to add, subtract and print the calculations.
 *  The values are reuturned and a string is shown in the console displaying all function calls.
*/

package cse360assign3;

/**
 * adds, subtracts and returns values
 * @author Not-yours
 *
 */

public class addingMachine 
{
	
	/**
	 * total is the amount in any calculation
	 */

	protected int total;

	/**
	 * is the string returned
	 */

	protected String totalString;

	/**
	 * initiated the total to zero and totalString to zero
	 */

	public addingMachine() 
	{
		
		/**
		 * included by the professor
		 */
		
		total = 0;

		/**
		 * string initated to zero
		 */

		totalString = "0";
	}

	/**
	 * prints the total everytime it is called with a new line
	 * @return
	 */

	public int getTotal() 
	{
		System.out.print("\n");
		System.out.print(total);
		
		/**
		 * returns the total value
		 */

		return total;
	}

	/**
	 * when called it is able to add numbers starting from zero
	 * @param value
	 */
	
	public void add(int value) 
	{
		
		/**
		 * the total is initiated to value
		 */

		total = total + value;

		/**
		 * the value is converted to string and added as a string to totalString
		 */

		totalString = totalString + "+" + Integer.toString(value);
	}

	/**
	 * subtracts a value when called
	 * @param value
	 */
	
	public void subtract(int value) 
	{
		
			/**
			 * the function calls total and subtracts the intended value
			 */

		total = total - value;
		
		/**
		 * concatenates the value to larger string called totalString
		 */
		
		totalString = totalString + "-" + Integer.toString(value); 

	}

	/**
	 * prints totalString when called and includes all the calculations performed during session
	 */
	
	public String toString() 
	{
		System.out.print(totalString);

		/**
		 * returns the whole string from calculations
		 */
		
		return totalString;
	}

	/**
	 * clear function after all calculations are done
	 */
	
	public void clear() 
	{

	}
}
