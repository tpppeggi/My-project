package com.peg;

import java.util.Scanner;

public class ScannerHello2 {
	public static void main(String[] args) {

		System.out.println("HELLO");

		System.out.println("請輸入你的名字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello," + line);

		System.out.println("今年幾歲？");
		Scanner scanner2 = new Scanner(System.in);
		int age = Integer.parseInt(scanner2.nextLine());
		System.out.println(age);
	}
}
