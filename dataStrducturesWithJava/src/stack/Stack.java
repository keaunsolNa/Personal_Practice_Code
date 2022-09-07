package stack;

/**
 * The <code>Stack</code> interface specifies the basic operations
 * of a last-in-first-out (LIFO) containers.
 */
public interface Stack {

	/** 
	 * Returns a reference to the top element on this stack, leaving 
	 * the stack unchanged.
	 * 
	 * @return the element at the top of this stack.
	 * @throws IllegalStateException if this stack is empty
	 */
	public Object peek();
	
	/** 
	 * Removes and returns the element at the top of this stack.
	 * 
	 * @return the element at the top of this stack.
	 * @throws IllegalStateExceptio if this stack is empty
	 */
	public Object pop();
	
	/**
	 * Adds the specified element to the top of this stack.
	 * 
	 * @param object the element to be pushed onto this stack.
	 */
	public void push(Object object);
	
	/**
	 * Returns the number of elements in this stack.
	 * 
	 * @return the number of elements in this queue.
	 */
	public int size();
	
}
