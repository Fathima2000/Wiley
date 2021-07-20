package com.wiley.Collections;

public class Sorting {

	public static void main(String[] args) {
		Address a11 = new Address("DEL",110001);
		Address a12 = new Address("BLR",560001);
		
		Address a21 = new Address("GN",201305);
		Address a22 = new Address("BLR",560001);
		
		Address a31 = new Address("GN",201305);
		Address a32 = new Address("BLR",560001);
		
		Usr u1 = new Usr(2,"User2");
		Usr u2 = new Usr(1,"User1");
		Usr u3 = new Usr(3,"User3");

	}

}

class Usr{
	private int id;
	String name;
	
	public Usr(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

class Address{
	private String city;
	private int zip;
	
	public Address(String city, int zip) {
		this.city=city;
		this.zip=zip;
	}
	
	public int getZip() {
		return zip;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setZip(int zip) {
		this.zip=zip;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
}


//[ address {city:BLR, zip:560001, users: [User{id:1, name:'User2'}, User{id:2, name:'User2'}]},
//  address {city:GN,  zip:201305, users: [User{id:1, name:'User1'}, User{id:3, name:'User3'}]}
//]