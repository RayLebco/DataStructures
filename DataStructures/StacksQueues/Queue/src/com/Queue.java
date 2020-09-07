package com;

public interface Queue<E> {
	
	/**
	 * Return the number of elements in a queue
	 */
	public int size();
	
	/**
	 * Return ture if the queue is empty, else false
	 */
	public boolean isEmpty();
	
	/**
	 * Inspects the element at the front of the queue
	 * @return the element at the front of the queue
	 * @exception EmptyQueueException if the queue is empty
	 */
	public E front() throws EmptyQueueException;
	
	/**
	 * Insert an element at the rear of the queue
	 * @param element to be inserted
	 * 
	 */
	public void enqueue( E element );
	
	/**
	 * Remove the element at the front of the queue
	 * @return element removed
	 * @exception EmptyQueueException if queue is empty
	 */
	public E dequeue() throws EmptyQueueException;
}
