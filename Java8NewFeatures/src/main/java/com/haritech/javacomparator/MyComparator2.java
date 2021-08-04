package com.haritech.javacomparator;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparator2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(0);	
		l.add(20);
		l.add(5);
		l.add(10);
		l.add(25);
		l.add(15);
		System.out.println(l);
		System.out.println("*****************************");
		List<Integer> l2=l.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		System.out.println("**********************************");
		List<Integer> l3=l.stream().sorted((I1,I2)-> - (I1).compareTo(I2))
				.collect(Collectors.toList());
		System.out.println(l3);
		Integer[] arr=l.stream().toArray(Integer[]::new);
		for(Integer x:arr) {
			System.out.println(x);
		}



		

	}

		

}
