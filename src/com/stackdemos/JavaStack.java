package com.stackdemos;

public class JavaStack {
	private int capacity;
	private int top = -1;
	private int size;
	private static final int CAPACITY = 10;

	private int stack[];

	public JavaStack() {
		stack = new int[CAPACITY];
	}

	public JavaStack(int capacity) {
		this.capacity = capacity;
		stack = new int[capacity];
	}
	
	public int push(int element) {
		stack[++top] = element;
		return element;
	}
	
	public int pop() {
		int element = stack[top--];
		return element;
	}
	
	public int getSize() {
		return size;
	}
	
	public void displayStack() {
		System.out.print("["+stack[0]);
		for(int i = 1;i<top ; i++ ) {
			System.out.print(", "+stack[i]);
		}
		System.out.println(stack[top]+" ]");
		System.out.println("size of the stack is :: "+(top+1));
	}

	public static void main(String[] args) {
		
		while(true) {
		System.out.println("::This is Java Stack Demo::");
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.show ");
		}
	}

}
