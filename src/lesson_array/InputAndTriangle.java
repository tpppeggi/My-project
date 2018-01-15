package lesson_array;

import java.util.Scanner;

public class InputAndTriangle {
	public static void main(String[] argv) {

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number to render a triangle: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		// once finished
		reader.close();
		// System.out.print(n*n*n*n*n);

		Homework homeworkObject = new Homework();
		homeworkObject.printNumber(n);

		System.out.println();

		// for (int i = 0; i < 10; i++) {
		// for (int j = 9; j > i; j--) {
		// System.out.print(j);
		// }
		// System.out.println();
		// }

		// Scanner reader = new Scanner(System.in); // Reading from System.in
		// System.out.println("Enter a number: ");
		// float n = reader.nextInt(); // Scans the next token of the input as an int.
		// //once finished
		// reader.close();
		// System.out.print(n*n*n*n*n);

		// for (int i = 0; i < 9; i++) {
		// for (int j = 0; j < 9; j++) {
		// if (Math.abs(4 - i) + Math.abs(j - 4) <= 4) {
		// System.out.print("*");
		// } else {
		// System.out.print(" ");
		// }
		// }
		// System.out.println();
		// }

		// for (int i = 0; i <= 9; i++) {
		// for (int j = 0; j <= i; j++) {
		// System.out.print(j);
		// }
		// System.out.println();
		// }
	}

	public static void sort(int[] data) {
		int j, pivot;
		// insert data[i] to sorted array 0 ~ i - 1
		// begins from i = 1, because if the array has only one element then it must be
		// sorted.
		for (int i = 1; i < data.length; i++) {
			pivot = data[i];
			for (j = i - 1; j >= 0 && data[j] > pivot; j--) {
				// shift data[j] larger than pivot to right
				data[j + 1] = data[j];
			}
			data[j + 1] = pivot;
		}
	}
}
