package com.wiley.DataStructures;

public class Queue {
	
	int front,rear,size,count,capacity;
	int a[];
	
	public Queue(int size) {
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
		a = new int[size];
	}
	
	int size() {
		return count;
	}
	
	boolean isEmpty() {
		return (size()==0);
	}
	
	boolean isFull() {
		return (size()==capacity);
	}
	
	void enqueue(int x) {
		if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		System.out.println(x+" is inserted in the queue");
		rear = (rear+1)%capacity;
		a[rear] = x;
		count++;
	}
	
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println(a[front]+" is removed from the queue");
		front = (front+1)%capacity;
		count--;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.enqueue(6);
	}

}
