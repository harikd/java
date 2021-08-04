package com.haritech.javacomparator;

import java.util.ArrayList;
import java.util.stream.Collector;

public class Test10 {

	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<String>();
		l.add("hari");
		l.add("harikd");
		l.add("harish");
		l.add("vasu");
		l.add("pallavi");
		System.out.println(l);
		System.out.println("****************************************");
		
		long l1=l.stream().filter(s->s.charAt(0)=='h').count();
		System.out.println(l1);
	}

}
