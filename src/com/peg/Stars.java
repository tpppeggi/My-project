package com.peg;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		System.out.println("請輸入number");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= number; i++) {

			for (int j = 1; j <= number; j++) {

				
				int a = j - i;
				if (a > 0) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}

			}

			System.out.println();

		}

	}

}
