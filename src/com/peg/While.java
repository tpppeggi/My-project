package com.peg;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int a = 1;
		while(a<=n) {
			System.out.print(a+" ");
			a++;
		}
		
	}

}
