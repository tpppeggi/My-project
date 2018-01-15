package com.peg;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		for (;;) {
			System.out.println("請輸入分數：");
			Scanner scanner = new Scanner(System.in);
			int n = Integer.parseInt(scanner.nextLine());
			int level = n / 10;
			switch (level) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Failed");
				break;
			case 6:
				System.out.println("Passed");
				break;
			case 7:
				System.out.println("Good");
				break;
			case 8:
				System.out.println("Great");
				break;
			case 9:
			case 10:
				System.out.println("Excellent");
				break;

			}
		}
	}

}
