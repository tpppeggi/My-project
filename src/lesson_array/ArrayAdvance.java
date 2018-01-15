package lesson_array;

import java.util.Scanner;

public class ArrayAdvance {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] copyArr = new int[15];
		for(int ele:copyArr) {
			System.out.print(ele);
		}
		System.out.println();
		System.arraycopy(intArr, 0, copyArr, 0, intArr.length);
		for(int ele:copyArr) {
			System.out.print(ele);
		}
		System.out.println();
		for(int ele:intArr) {
			System.out.print(ele);
		}
	}
}
