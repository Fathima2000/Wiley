package com.wiley.DataStructures;

class Node{
	int key;
	Node next;
	
	Node(int x) {
		key = x;
		next = null;
	}
}

public class LinkedList {
	private Node head;
	
	public void addFirst(int key) {
		Node temp = new Node(key);
		temp.next = head;
		head = temp;		
	}
	
	public void addLast(int key) {
		Node temp = new Node(key);
		if(head==null) {
			head = temp;
			return;
		}
		Node cur = head;		
		while(cur.next!=null)
			cur = cur.next;		
		cur.next = temp;
	}

	public Node deleteFirst() {
		if(head==null)	return null;
		Node temp = head;
		head = head.next;
		return temp;
	}
	
	public Node deleteLast(){
		if(head==null || head.next==null)	return null;
		Node cur = head;
		while(cur.next.next!=null)
			cur = cur.next;
		Node temp = cur.next;
		cur.next = null;
		return temp;
	}
	
	public void printLL() {
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.key+" ");
			cur = cur.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addLast(8);
		ll.addFirst(1);
		ll.addLast(9);
		//1 3 4 8 9
		ll.deleteLast();		
		ll.deleteFirst();
		ll.printLL();

	}

}

