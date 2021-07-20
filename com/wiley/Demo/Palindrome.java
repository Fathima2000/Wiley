package com.wiley.Demo;
import java.util.*;
public class Palindrome {
	
	static void palindrome(String str) {
		String rev_str=new StringBuffer(str).reverse().toString();
		if(str.equals(rev_str))
			System.out.println("Enter input is Palindrome");
		else
			System.out.println("Enter input is not Palindrome");
		
		//count if all are numbers
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='1' && str.charAt(i)<='9')
				count++;
		}
		if(count==str.length())
			System.out.println("Enter input is Number");
		else
			System.out.println("Enter input is String");		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		palindrome(str);

	}

}
