package com.wiley.Generics;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class User{
	public String id;
	public String name;
	
	User(String id, String name){
		this.id = id;
		this.name = name;
	}
}

class Address{
	public String city;
	public String zipCode;
	
	Address(String city, String zipCode){
		this.city = city;
		this.zipCode = zipCode;
	}
}


class Project{
	int projectId;
	public String name;
	int budget;
	
	Project(int projectId, String name, int budget){
		this.projectId = projectId;
		this.name = name;
		this.budget = budget;
	}
}

class Employe extends User{
	
	public Address address;
	public Project project;
	public int salary;

	Employe(String id, String name, Address address, Project project, int salary) {
		super(id,name);
		this.address = address;
		this.project = project;
		this.salary = salary;
	}	
}
//
//class sortBySalary implements Comparator {
//	@Override
//	public int compare(Object o1, Object o2) {
//	    e e1 = (e)o;
//	
//	    if(this.salary > e.salary){
//	        return 1;
//	    }else if(this.salary < e.salary){
//	        return -1;
//	    }else{
//	        return 0;
//	    }
//	}
//}

public class Generics {
	
	public static void main(String[] args) {
		Address a1 = new Address("Bengaluru","560068");
		Address a2 = new Address("Patna","560078");
		Address a3 = new Address("Delhi","560088");
		
		Project p1 = new Project(101,"Google",1000);

		
		List<User> users = new ArrayList<>();
		users.add(new User("u1","fathima"));
		
		users.add(new Employe("emp1","sariya",a1,p1,400));
		users.add(new Employe("emp2","samira",a2,p1,500));
		users.add(new Employe("emp3","danish",a3,p1,300));
		
		
		
		List<Employe> e= new ArrayList<>();
		
//		Collections.sort(e,new SortyBySalary());
		
//		for(Object u:users) {
//			if(u instanceof Employe)
//				e.add((Employe)u);
//		}
//		users.stream().filter(u->u instanceof Employe).map(u(Employe));

//		e.stream().sorted((i,j)-> j-i).collect(Collectors.toList());
		
		Collections.sort(e,(emp1,emp2)->emp1.salary-emp2.salary);
		
		for (Employe e1: e)
            System.out.println("empName:" + p1.projectId + " projectName:" + e1.id+e1.salary);


	}

}
