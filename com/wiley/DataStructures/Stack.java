package com.wiley.DataStructures;

public class Stack {
	
	static final int MAX = 5;
	int top;
	int a[] = new int[MAX];
	
	Stack() {
		top = -1;
	}
	
	void push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stack overflow");
			return;
		}
		else {
			a[++top] = x;
			System.out.println(x+" pushed into the stack");
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top--];
			System.out.println(x+" removed from the stack");
			return x;
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x = a[top];
			System.out.println(x+" is the peek element");
			return x;
		}
	}
	
	boolean isEmpty() {
		if(top<0) {
			System.out.println("Stack is empty");
			return true;
		}
		else {
			System.out.println("Stack is not empty");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.peek();
		s.pop();
		s.isEmpty();

	}

}
