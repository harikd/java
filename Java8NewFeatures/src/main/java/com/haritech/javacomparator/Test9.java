package com.haritech.javacomparator;

public class Test9 {
	
	
	public void m1() {
		for(int i=0;i<10;i++) {
			System.out.println("child thread");
		}
		
	}

	public static void main(String[] args) {
	 
		Test9 t=new Test9();
		Runnable r=t::m1;
		Thread t2=new Thread(r);
		t2.start();
		for(int j=0;j<10;j++) {
			System.out.println("main thread");
		}

	}

}
