package com.haritech.javacomparator;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		
		ArrayList<Student> l=new ArrayList<Student>();
		populate(l);
		Function<Student,String> f= s -> { int marks=s.marks;
		    
		    	if(s.marks>=80) {
		    		return "A [distention]";	
		    	}else if(s.marks>=70) {
		    		return "B [first class]";
		    	}else if(s.marks>=50) {
		    		return "C [second class]";
		    	}else if(s.marks>=35) {
		    		return "D [pass]";
		    	}
		   
			return "fail";
		};
		for(Student s1:l) {
		System.out.println("name:" +s1.name);
		System.out.println("marks:" +s1.marks);
		System.out.println("grade:" + f.apply(s1));
		}
		System.out.println("*********************************************************");
		
		Predicate<Student> p=s ->s.marks>=60;
		for(Student s:l) {
			if(p.test(s)) {
				System.out.println("name:" +s.name);
				System.out.println("marks:" +s.marks);
				System.out.println("grade:" + f.apply(s));
			}
		}
		
		}

	public static void populate(ArrayList<Student> l) {
		
		l.add(new Student("hari",89));
		l.add(new Student("hkd",67));
		l.add(new Student("harikd",19));
		l.add(new Student("krishna",54));
		l.add(new Student("kd",45));

	}
}
