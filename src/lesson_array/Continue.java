package lesson_array;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		 for(int i =1;i<14;i++) {
		 if(i%3==0) {
		 continue;
		 }
		 System.out.print(i+" ");
		 }
		 System.out.println();
		 
		int a = 0;
		while (a < 13) {
			a++;
			if (a % 3 == 0) {
				continue;
			}
			System.out.print(a + " ");
		}

	}

}
