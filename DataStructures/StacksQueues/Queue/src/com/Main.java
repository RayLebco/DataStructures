package com;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		ArrayQueue<Integer> A = new ArrayQueue<Integer>(5);
		//System.out.println((10-(0+1)) % 10);
		//System.out.println(10%9);
		System.out.println(A.size());
		System.out.println(A.isEmpty());
		A.enqueue(200);
		A.enqueue(333);
		A.enqueue(444);
		System.out.println(A.size());
		System.out.println(A.isEmpty());
		int i = A.front();
		System.out.println(i);
		System.out.println(A.dequeue());
		System.out.println(A.front());
		System.out.println(A.size());
		System.out.println(A.isEmpty());
		
		
	}

}
