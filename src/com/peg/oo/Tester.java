package com.peg.oo;

public class Tester {

	public static void main(String[] args) {
//		Student stu = new Student("Peggi",77, 99, 88);
		Student stu = new Student("Peggi");
		// stu.chinese = 99;
		// stu.english = 88;
		// stu.math = 77;
		stu.print();
		int avg = stu.average();
		System.out.println("Peggi's scores" + avg);
	}

}
