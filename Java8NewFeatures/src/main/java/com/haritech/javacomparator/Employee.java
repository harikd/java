package com.haritech.javacomparator;

public class Employee {
	String name;
	Double salary;

	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "[" + name + " :" + salary + "]";
	}
	

}
