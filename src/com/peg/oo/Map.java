package com.peg.oo;

import java.util.Scanner;

public class Map {
	public static void main(String[] args) {
		int hp = 100;
		int maps[][] = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };
		int row = 0;
		int col = 0;

		while (hp > 0) {
			Scanner scanner = new Scanner(System.in);
			int n = Integer.parseInt(scanner.nextLine());
			switch (n) {
			case 2:// down
				if (row == 2) {
					hp = hp - 30;
				} else {
					hp = hp - 5;
					row++;
				}
				break;
			case 8:// up
				if (row == 0) {
					hp = hp - 30;
				} else {
					hp = hp - 5;
					row--;
				}
				break;
			case 4:// left
				if (col == 0) {
					hp = hp - 30;
				} else {
					hp = hp - 5;
					col--;
					;
				}
				break;
			case 6:// right
				if (col == 4) {
					hp = hp - 30;
				} else {
					hp = hp - 5;
					col++;
				}
				break;
			}
			System.out.println("Your current HP: " + hp);
			System.out.println("Your current Position: " + maps[row][col]);
			if (hp <= 0) {
				System.out.println("You are dead");
			}
		}

	}
}
