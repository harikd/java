package com.haritech.javacomparator;

import java.util.ArrayList;

public class MinAndMax {

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
		int min=l.stream().min((I1,I2)->I1.compareTo(I2)).get();
		System.out.println(min);
		System.out.println("*****************************");
		int max=l.stream().max((I1,I2)->I1.compareTo(I2)).get();
		System.out.println(max);

	}

}
