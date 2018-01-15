package com.peg;

public class ForClass {

	public static void main(String[] args) {

		for (int b = 2; b <= 9; b++) {
			System.out.println();
			for (int a = 1; a <= 9; a++) {

				System.out.println(b + " x " + a + " = " + (a * b));
			}
		}

		int n = 12;
		if (n % 2 == 1) {
			System.out.println("it's odd");

		} else {
			System.out.println("it's even");
		}
	}
}
