package com.peg;

import java.util.Random;
import java.util.Scanner;

public class Lucky {

	public static void main(String[] args) {
		System.out.print("please enter a number");
		Scanner scanner = new Scanner(System.in);
		int a = Integer.parseInt(scanner.nextLine());

		Random r = new Random();
		int n1 = r.nextInt(6) + 1;
		int n2 = r.nextInt(6) + 1;
		int n3 = r.nextInt(6) + 1;
		int n4 = r.nextInt(6) + 1;
		int n5 = r.nextInt(6) + 1;
		int n6 = r.nextInt(6) + 1;
		System.out.print(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
		if (a == n1 || a == n2 || a == n3 || a == n4 || a == n5 || a == n6) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}

	}
}
