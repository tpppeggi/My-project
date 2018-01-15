package com.peg;

import java.util.Scanner;

public class ScannerHello {
	public static void main(String[] args) {
		System.out.println("HELLO");

		System.out.println("請輸入你的名字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("Hello," + line);

		System.out.println("今年幾歲？");
		int age = Integer.parseInt(line);
		System.out.println(line);

		int x = 3;
		int y = 2;
		float f = 5.0f;
		int a = (int)(f/x);
		System.out.println(a);
		
	}

}
