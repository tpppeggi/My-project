package com.peg;

public class HELLO {
	public static void main (String[] args) {
		int a = 5, b = 6, c = 7;
		int total;
		total = summary(a, b)+peg(b, c);
//		String s = "abc";
//		String s_upper = s.toUpperCase();
		
		System.out.println("Hello world");
		
//		
		Person dddd = new Person();
		String arr[];
		arr = new String[5];
		dddd.sayHello(arr);
	}

	
	
	public static int summary(int A, int B)
	{
		int sum = 0;
		sum = A + B;
		return sum;
	}
	
	public static int peg(int a, int b)
	{
		return a * b;
				
	}
	

}
