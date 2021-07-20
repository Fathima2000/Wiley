package com.wiley.banking;
import java.util.*;

public class Banking {
	
	Map<Integer, Integer> mp = new HashMap<>();
	private int curBalance = 0;
	
	public static void main(String[] args) {
	
		List<Customer> cust = Arrays.asList(new Customer(1,"fathima",Arrays.asList(new Account(101,500), new Account(102,1000))),
											new Customer(2,"danish",Arrays.asList(new Account(103,1500), new Account(104,500))));
		
		
		Banking b = new Banking();
		b.mp.put(500,10);
		b.mp.put(100,10);
		b.mp.put(50,10);
		b.mp.put(10,10);
		
		b.updateATMBal();
		
	}	
	
	void updateATMBal() {
		mp.forEach((k,v)->{
							curBalance+=k*v;
						  });
		System.out.println(curBalance);		
	}
	
}

class Transaction{
	int acc_no;
	int amount_withdr;
	final int max_amount = 1500;
	final int min_amount = 10;
	
	Map<Integer, Integer> ATMmap = new HashMap<>();
	Map<Integer, Integer> transMap = new HashMap<>();

	public Transaction(int acc_no, int amount_withdr, Map<Integer, Integer> transMap) {
		this.acc_no = acc_no;
		this.amount_withdr = amount_withdr;
		this.transMap = transMap;
	}	
}


class Customer{
	int cust_id;
	String name;
	List<Account> acc= new ArrayList<>();
	
	public Customer(int cust_id, String name, List<Account> acc) {
		this.cust_id = cust_id;
		this.name = name;
		this.acc = acc;
	}
	
	public int getCustId() {
		return cust_id;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", acc=" + acc + "]";
	}
	
	
}

class Account{
	int acc_no;
	int acc_balance;
	
	public Account(int acc_no, int acc_balance) {
		this.acc_no = acc_no;
		this.acc_balance = acc_balance;
	}
	
	public int getAccNo() {
		return acc_no;
	}
	
	public int getAccBal() {
		return acc_balance;
	}

	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", acc_balance=" + acc_balance + "]";
	}
	
}

class Transactio {

	private Integer trans_id;
	private Integer trans_amount;	
	
	public Transactio(Integer trans_id, Integer trans_amount) {
		this.trans_id = trans_id;
		this.trans_amount = trans_amount;
	}
	
	public Integer getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(Integer trans_id) {
		this.trans_id = trans_id;
	}
	public Integer getTrans_amount() {
		return trans_amount;
	}
	public void setTrans_amount(Integer trans_amount) {
		this.trans_amount = trans_amount;
	}
	
	public void Withdraw() {
		
	}
	
	public void Deposit() {
		
	}

	public int ChckBalance() {
		return trans_amount;
		
	}
	
	public void MiniStatement() {
		
	}
}

