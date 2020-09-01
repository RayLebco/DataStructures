package com.stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o;
		ArrayStack<Integer> A = new ArrayStack<Integer>();
		System.out.println(A.isEmpty());
		System.out.println(A.size());
		//System.out.println(A.top());
		A.push(2);
		System.out.println(A.isEmpty());
		System.out.println(A.size());
		System.out.println(A.top());
		
	}

}
