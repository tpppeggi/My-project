package com.peg;

public class DateOfYear {

	public static void main(String[] args) {
		int n = 100;
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < month.length; i++) {
			if (n <= month[i]) {
				System.out.print((i + 1) + "/" + n);
				break;
			}else {
				n = n - month[i];
			}
		}
	}

}
//要記住return的數值在其中已經出來，不需要再想return，
//之所以還用n就是因為而後的數值被重新賦予。