package com.wiley.Demo;

public class Fibonacci extends Thread{
	
	int n;
	public Fibonacci(int n) {
		this.n=n;
	}

	public void run() {
		int arr[] =  new int[n+2];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<=n;i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println("Sum of fibonacci series is "+arr[n]);
		
		int prev=0;
		for(int i=1;i<=n;i++) {
			System.out.println(prev+"+"+arr[i]+"="+(prev+arr[i]));
			prev=prev+arr[i];
		}
	}
	
	public static void main(String[] args) {
		int n = 8;
		Fibonacci f = new Fibonacci(n);
		f.start();
	}

}
