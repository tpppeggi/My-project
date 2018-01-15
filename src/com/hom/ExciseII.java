package com.hom;
/*
 * 函式的原式及呼叫,函式 複製字串
 */
public class ExciseII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myStr = copyStr(8, "Javascript");
		System.out.println(myStr);

	}

	public static String copyStr(int n, String str) {
		String returnString = "";
		for (int i = 0; i < n; i++) {
			returnString = returnString + str;
		}
		return returnString;

	}
}
