package com.peg;

public class Sequence {

	public static void main(String[] args) {
		int a[] = { 62, 84, 27, 46, 38, 19, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int num:a) {
			System.out.print(num+" ");
		}
	}
}