package com.wiley.Demo;
import java.util.*;

class Employee {
	public int empSalary;
    public String empCity,empId;
 
    public Employee(String empId, String empCity, int empSalary) {
    	this.empId = empId;
        this.empCity = empCity;
        this.empSalary = empSalary;
    }  
}

class empSort implements Comparator < Employee > {
    public int compare(Employee emp1, Employee emp2) {
        if((emp1.empSalary - emp2.empSalary) !=0) 
        	return emp2.empSalary - emp1.empSalary;
		return emp1.empCity.compareTo(emp2.empCity);
    }
}

public class Comp {	
	public static void main(String[] args) {
		List <Employee> employees = new ArrayList <Employee> ();
        employees.add(new Employee("E1", "BOM", 1000));
        employees.add(new Employee("E2", "DEL", 1200));
        employees.add(new Employee("E3", "BLR", 1000));
 
        Collections.sort(employees, new empSort());
 
        for (Employee e: employees)
            System.out.println("empId:" + e.empId + " empCity:" + e.empCity + " empSalary:" + e.empSalary);
        
	}	
}
