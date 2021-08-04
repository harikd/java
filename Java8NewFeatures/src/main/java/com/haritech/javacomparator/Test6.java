package com.haritech.javacomparator;

import java.util.Scanner;
import java.util.function.Function;

public class Test6 {

	public static void main(String[] args) {
		
		Function<String,String> f1=s->s.toLowerCase();
		Function<String,String> f2=s->s.substring(0,4);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name");
		String user=sc.next();
		System.out.println("enter the pwd");
		String pwd=sc.next();
		
		if(f1.andThen(f2).apply(user).equals("hari")&&pwd.equals("java")) {
			System.out.println("valid user");
		}else {
			System.out.println("invalid user");
		}

	}

}
