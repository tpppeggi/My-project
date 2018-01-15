package com.peg;

public class Prime {

	public static void main(String[] args) {

		for (int n = 1000; n >= 1; n--) {
			boolean j = false;
			for (int a = 2; a < n; a++) {
				if (n % a == 0) {
					j = true;
					break;
				}

			}
			if (j == false) {
				System.out.print(n + " ");
			}
			// int n = 1000; n >= 1; n--
			// int a = 2; a <= 1000; a++
		}

	}

}
