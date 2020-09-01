package com.stack;

/**
 * Implementation of the stack ADT using a fixed length array. 
 * From the book: "Data Structures & Algorithms" by Goodrich, Tamassia
 * 
 * @author RayLebCo
 *
 * @param <E> element type for the stack
 */
public class ArrayStack<E> implements rl_stack<E> {
	protected int capacity; //actual capacity of the stack array
	public static final int CAPACITY = 100; //default stack array capacity
	protected E S[]; //generic array used to implement the stack
	protected int top = -1; //index for the top of the stack
	
	/**
	 * Initiate the stack array with default capacity size
	 * 
	 */
	public ArrayStack() {
		this(CAPACITY);
	}
	
	/**
	 * Initiate array S of object E with a capacity size of i
	 * 
	 * @param i Size of the stack array.
	 */
	public ArrayStack(int i) {
		capacity = i;
		S = (E[]) new Object[capacity]; 
	}
	
	/**
	 * Return the current size of the stack
	 * 
	 * @return int current size of stack
	 */
	public int size() {
		return (top + 1);
	}
	
	/**
	 * Return true if current stack size is less than 0, false otherwise
	 * 
	 * @return True if stack is empty, false otherwise
	 */
	public boolean isEmpty() {
		return (top < 0);
	}

	/**
	 * Inspect the top element in the stack
	 * 
	 * @return top element in the stack
	 * @exception EmptyStackException if the stack is empty
	 */
	public E top() throws EmptyStackException {
		if( isEmpty() )
			throw new EmptyStackException("Stack is empty.");
		return S[top];
	}

	/**
	 * Insert an element at the top of the stack.
	 * @param element to be inserted
	 */
	public void push(E element) throws FullStackException {
		if (size() == capacity) {
			throw new FullStackException("Stack is full.");
		}
		S[++top] = element;
		
	}

	@Override
	public E pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}
}
