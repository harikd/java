package com.haritech.javacomparator;
import com.haritech.javacomparator.Student;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test7 {

	public static void main(String[] args) {
		
		ArrayList<Student> l=new ArrayList<Student>();
		Predicate<Student> p=s->s.marks>=50;
		Function<Student,String> f=s->{int marks=s.marks;
		
		if(marks>=80) {
			return "A [Distention]";
		}else if(marks>=50) {
			return "B [fristclass]";
		}else if(marks>=40) {
			return "C [secondClass]";
		}else {
		return "E [fail]";
		}
		
		};
		Consumer<Student> c=s->{
			System.out.println("Student name:"+s.name);
			System.out.println("Student marks:"+s.marks);
			System.out.println("Student grade:"+f.apply(s));
			
		};
	for(Student s:l) {
		if(p.test(s)) {
			c.accept(s);
		}
		
	}

	}
	public static void populate(ArrayList<Student> l) {
		l.add(new Student("hari",89));
		l.add(new Student("harish",59));
		l.add(new Student("harikd",49));
		l.add(new Student("harikrishna",39));
		
	}

}
