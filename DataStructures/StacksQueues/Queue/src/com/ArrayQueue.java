package com;

public class ArrayQueue<E> implements Queue<E> {

	protected int capacity; //Size the queue can hold
	public static final int CAPACITY = 100; //default capacity of the queue
	protected E Q[]; //Generic queue array
	protected int f; //front of the queue
	protected int r; //rear of the queue
	
	/**
	 * Default constructor
	 */
	public ArrayQueue() {
		this(CAPACITY);
	}
	
	/**
	 * Constructor with a given capacity
	 * @param i given capacity for the queue
	 */
	public ArrayQueue(int i) {
		capacity = i;
		Q = (E[]) new Object[capacity];
		f = r = 0; //default the front and rear to point 0
	}
	
	/**
	 * Return the current size of the queue
	 */
	public int size() {
			int i = (capacity - f + r);
			return (i%capacity);
	}

	/**
	 * Return true if queue is currently empty, else false
	 */
	public boolean isEmpty() {
		return ( f == r );
	}

	/**
	 * Inspect the element at the front of the queue
	 */
	public E front() throws EmptyQueueException {
		if( isEmpty() ) throw new EmptyQueueException("Queue is empty");
		return Q[f];
	}

	/**
	 * Insert an element into the queue
	 * @throws FullQueueException 
	 */
	public void enqueue(E element) throws FullQueueException {
		if( size() == (capacity - 1)) {
			throw new FullQueueException("Queue is full.");
		}
		Q[r] = element;
		r = (r+1) % capacity;
		
	}
	// TODO Auto-generated method stub
	
	/**
	 * Removes the element at the front of the queue
	 */
	public E dequeue() throws EmptyQueueException {
		if( isEmpty() ) throw new EmptyQueueException("Queue is empty.");
		E t = Q[f];
		f = (f+1) % capacity;
		
		return t;
	}

	
}
