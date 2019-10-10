package cse360assign2;

/**
 * This class allows for addition and subtraction of numbers. In
 * addition it keeps a record of additions and subtractions and keeps
 * track of the total. 
 * https://github.com/SerecZer/cse360as2
 * @author Ceres Perez
 */
public class AddingMachine {

	private int total;
	private String record = "0";
	
	/**
	 * Constructor starts with total at zero. No arguments
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the total of the adding machine
	 * @returns total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add the argument to the total and keeps a record of the addition
	 * @param value
	 */
	public void add (int value) {
		total = total + value;
		record = record + " + " + value;
	}
	
	/**
	 * Subtracts the argument from the total and keeps a record of
	 * the subtraction
	 * @param value
	 */
	public void subtract (int value) {
		total = total - value;
		record += " - " + value;
	}
	
	/**
	 * Returns a string containing the record of additions and transactions
	 * @returns record
	 */
	public String toString () {
		return record;
	}
	
	/**
	 * Resets the total to zero and clears the record
	 */
	public void clear() {
		total = 0;
		record = "0";
	}
}
