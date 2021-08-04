package com.haritech.javacomparator;

import java.util.function.Function;

import org.springframework.util.SystemPropertyUtils;

public class Test3 {

	public static void main(String[] args) {
		
		String s="hari krish kd remata ";
		//to remove spaces in the given String
		Function<String,String> f=s1->s1.replaceAll(" ","");
	     System.out.println(f.apply(s));

	     //to count the number of Spaces in the given String
	     Function <String,Integer> f2=s2->s2.length() - s2.replaceAll(" ","").length();
	     System.out.println(f2.apply(s));
	}

}
