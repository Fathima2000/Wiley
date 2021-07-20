package com.wiley.Demo; 

class GrandParent{
	void print() {
		System.out.println("Grandparent");		
	}
}

class Parent extends GrandParent{
	void show() {
		System.out.println("Parent");		
	}
}


public class Inheritance extends GrandParent{
	
	void display() {
		System.out.println("Child");
	}
	
	public static void main(String args[]) {
		Inheritance obj=new Inheritance();
		Parent obj1=new Parent();
		obj.print();
		obj1.show();
	}
}