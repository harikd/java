package com.haritech.javacomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		 l.add(5);
		 l.add(15);
		 l.add(10);
		 l.add(3);
		 l.add(40);
		 System.out.println(l);
		 Collections.sort(l,new MyComparator());
		 
		

	}

}
