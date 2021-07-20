package com.wiley.Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UserAssignment {

	public static void main(String args[]) {
		
		//case 1
		Set<Object> custSet = new TreeSet<Object>(new SortByIntUidStr());
		//case 2
		//Set<Object> custSet = new TreeSet<Object>(new SortByStrUidInt());
		//case 3
		//Set<Object> custSet = new TreeSet<Object>(new SortByStrInt());

		custSet.add(new Integer(2));
		custSet.add(new String("Hello"));
		custSet.add(new Userr(2,"User2"));
		custSet.add(new Integer(1));
		custSet.add(new String("Hi"));
		custSet.add(new Userr(1,"Adam"));
		
		System.out.println(custSet);
	}

}


class Userr {
    private int id;
    private String name;
    
    public Userr(int id, String name) {
    	super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    public String toString() {
//    	return id+ " " +name;
//    }
}

class SortById implements Comparator<Userr>{

	@Override
	public int compare(Userr o1, Userr o2) {
		return o1.getId()-o2.getId();
	}
	
}

class SortByString implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof User) {
			if(o2 instanceof String)
				//return o1.compareTo(o2);
				return ((Userr)o1).getName().compareTo((String)o2);
		}
		else if(o1 instanceof String) {
			if(o2 instanceof Userr)
				return ((String)o1).compareTo(((User)o2).getName());
		}
		return 0;
	}	
}

class SortByStrUidInt implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String) {
			if(o2 instanceof String)
				return o1.toString().compareTo(o2.toString());
			else
				return -1;
		}
		return 0;
	}
	
}

class SortByUserName implements Comparator<Userr>{

	@Override
	public int compare(Userr o1, Userr o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortByIntUidStr implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer) {
			if(o2 instanceof Integer)
				return (int)o1-(int)o2;
			else
				return -1;
		}
		else if(o1 instanceof Userr) {
			if(o2 instanceof Userr)
				return ((Userr)o1).getId()-((Userr)o2).getId();
			else
				return -1;
		}
		else if(o1 instanceof String) {
			if(o2 instanceof String)
				return  o1.toString().compareTo(o2.toString());
		}
		return 0;
	}
	
}

//set = [2,1, User{2,"User2"},User{1,"Adam"},Hi,Hello]

//integers, users, strings

//case 1: sort : show the integers first then users sorted by user id then strings

//expected sort : 1,2,User{1,"Adam"}, User{2,"User2"} (user by id),Hello,Hi

//case 2: sort : show me sorted strings then users sorted by user id then integers

//expected sort : Hello,Hi, User{1, "Adam"}, User{2,"User2"},1,2

//case 3: sort : show all the objects sorted based on string whether that is username or simple string then integers

//expected sort : User{1,"Adam"},Hello,Hi,User{2,"User2"},1,2