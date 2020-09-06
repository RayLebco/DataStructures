package com.stack;

public class NodeStack<E> implements rl_stack<E> {

	protected Node<E> top; //reference to head node
	protected int size; //number of elements in stack
	
	//implements empty stack
	public NodeStack() {
		top = null;
		size = 0;
	}
	
	//return size of stack
	public int size() {
		return size;
	}

	//return TRUE if empty else false
	public boolean isEmpty() {
		if(top == null) return true;
		return false;
	}

	//Return the top element of the stack
	public E top() throws EmptyStackException {
		if(isEmpty()) throw new EmptyStackException("Stack is empty.");
		return top.getElement();
	}

	//Add element to the top of the stack
	public void push(E element) {
		Node<E> v = new Node<E>(element, top);
		top = v;
		size++;
	}

	//Returns top element of the stack and removes it from the stack.
	public E pop() throws EmptyStackException {
		if (isEmpty()) throw new EmptyStackException("Stack is empty.");
		E temp = top.getElement();
		top = top.getNext();
		size--;
		return temp;
	}

}
