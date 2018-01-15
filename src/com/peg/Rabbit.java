package com.peg;

/**
 * 古典問題：有一對兔子，從出生後第3個月起每個月都生一對兔子，
 * 小兔子長到第三個月後每個月又生一 對兔子，假如兔子都不死，問每個月的兔子總數為多少？
 * 
 * @author peggitan
 *
 */
public class Rabbit {
	public static void main(String[] args) {
		int endMonth = 9;

		for (int month = 1; month <= endMonth; month++) {
			System.out.println(calculate(month));
		}

	}

	public static int calculate(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		return calculate(n - 1) + calculate(n - 2);
	}

}
