package com.stack;
/**
 * Interface for a stack, includes the main methods of java.util.Stack
 * 
 * @author RayLebCo
 *
 */

public interface rl_stack<E> {

	/**
	 * Return the number of elements in the stack
	 * @return number of elements in the stack
	 */
	public int size();
	
	/**
	 * Return whether the stack is empty
	 * @return true if stack is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Inspect the element at the top of the stack
	 * @return top element in the stack
	 * @exception EmptyStackException if the stack is empty
	 */
	public E top()
		throws EmptyStackException;
	
	/**
	 * Insert an element at the top of the stack.
	 * @param element to be inserted
	 */
	public void push (E element);
	
	/**
	 * Remove the top element from the stack
	 * @return element removed.
	 * @exception EmptyStackException if the stack is empty
	 */
	public E pop()
		throws EmptyStackException;
	
}

