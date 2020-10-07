package cse360assignment02;

/**
 * class that calculates total using different operators and produces a string of the operations called
 * @author Maria Ananickal
 * @version 1.1
 */
public class AddingMachine {
	  private int total = 0;
	  private String output = "0";
	  /**
	   * constructor for the AddingMachine class
	   * creates AddingMachine object
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }

	  /**
	   * returns the total 
	   * @return the current total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * Adds the value passed in to the total
	   * @param integer value to be added
	   */
	  public void add (int value) {
		  total += value;
		  output += " + " + value;
	  }

	  /**
	   * Subtracts the value passed in from the total
	   * @param integer value to be subtracted
	   */
	  public void subtract (int value) {
		  total -= value;
		  output += " - " + value;
	  }

	  /**
	   * Creates string of all values and methods that have been called 
	   * @return string of values passed into previous methods
	   */
	  public String toString () {
	    return output;
	  }

	  /**
	   * clears total and sets it back to zero 
	   */
	  public void clear() {
		  total=0;
		  output="";
	  }
	  
	  /**
	   * Creates string of all values and methods that have been called 
	   * @return string of values passed into previous methods
	   */
	  public static void main(String[] args) {
		  AddingMachine myCalculator = new AddingMachine();
		  myCalculator.add (4); 
		  myCalculator.subtract (2); 
		  myCalculator.add(5);
		  System.out.println(myCalculator.getTotal());
		  System.out.println(myCalculator.toString());
	  }
	  
}
