package com.hom;
import java.util.Arrays;
/*
 * 題目：矩陣相乘

 */
public class Excise {

	public static void main(String[] args) {

		int m1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int m2[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int m3[][] = new int[m1.length][m2[0].length];
		for (int i = 0; i < m3.length; i++) {

			for (int j = 0; j < m3[i].length; j++) {
				int subtotal = 0;
				for (int k = 0; k < m1[0].length; k++) {
					//subtotal += m1[i][k] * m2[k][j];
					subtotal = subtotal + m1[i][k] * m2[k][j];
				}
				m3[i][j] = subtotal;
			}
		}

		System.out.println(Arrays.deepToString(m3));		
	}

}
