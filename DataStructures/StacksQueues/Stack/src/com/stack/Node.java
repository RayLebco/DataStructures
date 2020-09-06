package com.stack;

/**
 * Node class to implement a generic node for a singly linked list.
 * 
 * @author RayLebCo
 *
 * @param <E>
 */
public class Node<E> {

	private E element;
	private Node<E> next;
	
	/**
	 * Create a node with null references to its elements and next node
	 */
	public Node() {
		this(null, null);
	}
	
	/**
	 * Create a node with the given element and next node
	 * @param e given element
	 * @param n given next node
	 */
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}
	
	//Access methods
	public E getElement() {
		return element;
	}
	
	public Node<E> getNext() {
		return next;
	}
	
	//Modifier methods
	public void setElement(E newElem) {
		element = newElem;
	}
	
	public void setNext(Node <E> newNext) {
		next = newNext;
	}
	//end
}
