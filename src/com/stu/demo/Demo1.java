package com.stu.demo;

public class Demo1 {

	public static void main(String[] args) {
		
		int i = 1;
		
		i *=0.1;
		i = (int) (i * 0.1);
		// 1 * 0.1  = 0.1
		
		System.out.println(i);
		// 因为
		int j = (int) (2 * 0.3);
		double d = 3 * 0.4;
		System.out.println(j);
		System.out.println(d);
		
		short s = 1;
		s = (short) (s + 3);
	}
	
}
