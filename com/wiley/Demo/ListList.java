package com.wiley.Demo;
import java.util.*;

public class ListList {

	public static void main(String[] args) {
		Projects p1 = new Projects(1,"PRJ1");
		Projects p2 = new Projects(2,"PRJ2");
			
		List<Users> u= new ArrayList<Users>();
		u.add(new Users(1,"User1",p1));
		
//		List<ArrayList<Project>>p = createProject();
//		List<ArrayList<Uselist>>u = createuser(projlist));
		
		Map<List,List>m = new HashMap<>();
		
//		for(Users i:u) {
//			m.put(m.add(i.getId(), i.getName()),m.put(i.getPid(),i.getPname()));
//		}
		
		
	}
}

class Projects{
	int pid;
	String pname;
	
	public Projects(int pid, String pname) {
		this.pid = pid;
		this.pname = pname;
	}
	Projects(){		
	}
	public int getPid() {
		return this.pid;
	}
	public String getPname() {
		return this.pname;
	}
}

class Users extends Projects{
	int id;
	String name;	

	public Users(int id, String name, Projects p1) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}