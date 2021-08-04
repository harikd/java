package com.haritech.javacomparator;

import java.util.Scanner;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<User> p=u->u.username.equals("hari")&& u.pwd.equals("kd001");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the username");
		String username=sc.next();
		System.out.println("enter the pwd");
		String pwd=sc.next();
		
		User user=new User(username,pwd);
		
		if(p.test(user)){
			System.out.println("vaild user ....");
		}else {
			System.out.println("invaild user...");
		}
		
		
		
		
	}

}
