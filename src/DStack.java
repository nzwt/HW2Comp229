
 /*
  * This interface provides the template for what you need to implement.
  * Do not modify this file.
  * Your homework implementation must implements this interface.
  */
public interface DStack {
	
	/**
	 * This method should return the number of elements in the Stack.
	 */
	public int size();
	
    /** 
     * This method should return true if the Stack is empty.
     */
	
    public boolean isEmpty();

    /**
     * This method takes a double d and pushes d to the Stack. 
     */
    
    public void push(double d);

    /**
     * This method removes and returns the top of the Stack.
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    
    public double pop();

    /**
     * This method returns the top of the Stack without removing.
     * @throws EmptyStackException if stack is empty
     */
    
    public double peek();
    
    /**
     * This method returns a formatted string of the Stack from top to bottom:
     * 3.4  2.3  5.2  6.5
     */
    
    public String toString();
}
