package com.wiley.DataStructures;

public class CircularQueue {
	
	static final int MAX = 100;
	int a[] = new int[MAX];
	int n,front,rear;
	
	public CircularQueue(int size) {
		n = size;
		front = 0;
		rear = 0;
	}

	void enqueue(int x) {
		if((rear+1)%n!=front){
			rear = (rear+1)%n;
			a[rear] = x;
			System.out.println(x+" inserted in the queue");
		}
		else
			System.out.println("Queue is Full");
	}
	
	void dequeue() {
		if(front!=rear) {
			front = (front+1)%n;
			int x = a[front];
			System.out.println(x+" deleted from the queue");
		}
		else 
			System.out.println("Queue is Empty");
	}
	
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.dequeue();
	}

}
