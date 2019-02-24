/**
 * Class ID: 303
 * <p>
 * Assignment Number: 2
 * <p>
 * File Description: File contains Calculator class with the purpose of 
 * performing basic functions of a calculator. It includes a add method, 
 * subtract method, getTotal method, and divide method. There is also a 
 * getHistory method that returns the history of all actions as a String. 
 * 
 * @author Komal Agrawal
 * @since 2019-02-24
 */
package cse360assign2;

/**
 * Performs basic computations such as addition, subtraction, and division from
 * a parameter to the total. 
 * The history of the computations are tracked and can be retrieved from the 
 * getHistory method. 
 *
 */
public class Calculator {
	
	/** 
	 * total is a class variable that is the current numerical total of all 
	 * operations performed.  
	 */
	private int total;
	
	/**
	 * Initializes total variable as 0 when a new Calculator object is 
	 * instantiated
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current total numerical value from all operations performed 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter to the total variable
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtracts the parameter from the total variable
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the total by the parameter
	 * @param value
	 */
	public void multiply (int value) {
		total = total*value;
	}
	
	/**
	 * Divides the total by the parameter. If the parameter is 0 then the total
	 * is set to 0. Method uses integer division.  
	 * @param value
	 */
	public void divide (int value) {
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total/value;
		}
	}
	
	public String getHistory () {
		return "";
	}

}
