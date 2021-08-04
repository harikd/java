package com.haritech.javacomparator;


import java.util.Date;
import java.util.function.Supplier;

public class Test8 {

	public static void main(String[] args) {
       
		Supplier<Date> s=()->new Date();
		System.out.println(s.get());
		
System.out.println("*********************************");
Supplier<String> s1=()->{String[] s2= {"hari","kd","harish","krishna"};
                                      int x= (int)(Math.random() *4);
                                      return s2[x];
};
System.out.println(s1.get());
System.out.println("*********************************");
Supplier<String> s3=()->{ String otp="";
                         for(int i=0;i<6;i++) {
                        	 otp=otp+(int)(Math.random()*10);
                         }return otp;
	
};
System.out.println(s3.get());
System.out.println("*********************************");
Supplier<String> s4=()->{
	Supplier<Integer> d=()->(int)(Math.random()*10);
	String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
	Supplier<Character> c=()->symbols.charAt((int)Math.random()*29);
	String pwd="";
	for(int i=1;i<=8;i++) {
		if(i%2==0) {
			pwd=pwd+d.get();
		}else {
			pwd=pwd+c.get();
		}
	}
	return pwd;
	
};
System.out.println(s4.get());
System.out.println(s4.get());
System.out.println(s4.get());
System.out.println(s4.get());

}
}