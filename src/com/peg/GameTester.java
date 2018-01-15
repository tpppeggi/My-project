package com.peg;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		System.out.println("請輸入方向");
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		int hp = 100;
		int pos = 0;
		int rowColunm[][] = { { 0, 1, 2, 3, 4 }, { 0, 1, 2, 3, 4, }, { 0, 1, 2, 3, 4 }

		};
		if (n == 2) {
			pos = rowColunm[1][0];
			hp = hp - 5;
		}
		if (n == 4) {
			pos = pos + 0;
			hp = hp - 30;
		}
		if (n == 6) {
			pos = rowColunm[0][1];
			hp = hp - 5;
		}
		if (n == 8) {
			pos = pos + 0;
			hp = hp - 30;
		} else {
			pos = pos + 0;
			hp = hp - 30;
		}
		System.out.print("hp=" + hp + " pos=" + pos);

//		for (;;) {
//
//			switch (n) {
//			case 2:
//				System.out.println("向下");
//				break;
//			case 4:
//				System.out.println("向左");
//				break;
//			case 6:
//				System.out.println("向右");
//				break;
//			case 8:
//				System.out.println("向上");
//				break;
//			case 0:
//				System.out.println("bye");
//				break;
//			default:
//				System.out.println("無方向");
//
//			}
//			if (n == 0) {
//				break;
//			}

		}
	}


