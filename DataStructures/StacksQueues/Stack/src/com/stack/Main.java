package com.stack;

public class Main {

	public static void main(String[] args) {
		NodeStack<Integer> A = new NodeStack<Integer>();
		System.out.println(A.isEmpty());
		System.out.println(A.size());
		//System.out.println(A.top());
		A.push(2);
		System.out.println(A.isEmpty());
		System.out.println(A.size());
		System.out.println(A.top());
		A.push(3);
		A.push(5);
		A.push(6);
		System.out.println(A.size());
		System.out.println(A.pop());
		System.out.println(A.size());
		
	}

}
