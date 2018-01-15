package com.peg;

public class ArrayDice {

	public static void main(String[] args) {
		int n[] = new int[4];
		n[0] = 82;
		n[1] = 36;
		n[2] = 92;
		n[3] = 12;
		for (int i = 0; i < 4; i++) {
			System.out.println(n[i]);
		}

		int a[] = { 3, 5, 6, 8, 3, 6 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for(int i:a) {
			System.out.println(i);
		}

	}

}
