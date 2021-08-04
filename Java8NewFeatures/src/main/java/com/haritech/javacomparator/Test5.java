package com.haritech.javacomparator;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test5 {

	public static void main(String[] args) {
		ArrayList<Employee> l=new ArrayList<Employee>();
		populate(l);
		System.out.println(l);
		Function<ArrayList<Employee>,Double> f=l1->{
			    double total=0;
			    for(Employee e:l1) {
			    	 total=total+e.salary;
			    }
			
			return total;
		};
		System.out.println("total monthly salary :"+f.apply(l));
		System.out.println("***************************************************");
		System.out.println("before incriment");
		System.out.println(l);
		Predicate<Employee> p=e->e.salary<3500;
		Function<Employee,Employee> f1= e->{ e.salary=e.salary+540;
		                                        return e;	
		};
		ArrayList<Employee> l2=new ArrayList<Employee>();
		for(Employee e:l) {
			if(p.test(e)) {
		       ;
				l2.add(f1.apply(e));
			}
		}
		System.out.println("After incriment salary");
		System.out.println(l);
		System.out.println("incrimented salary");
		System.out.println(l2);
		
	}
	public static void populate(ArrayList<Employee> l) {
		l.add(new Employee("hari",1000));
		l.add(new Employee("harikd",2000));
		l.add(new Employee("harish",3000));
		l.add(new Employee("harikrishna",4000));
	}

}
