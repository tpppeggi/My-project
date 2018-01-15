package lesson_array;

//import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		System.out.println("HELLO");
//		System.out.print(Sport.run());
		

		System.out.println("請輸入你的名字");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		String line = scanner.nextLine();
		line = line.trim();
		System.out.println("Hello," + line);

		System.out.println("請輸入你的四位數字密碼？");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println(age);

		/*
		 * 基本if開始
		 */
		// if(age <= 10) {
		// System.out.println("你好小朋友");
		// }else if(age <= 25) {
		// System.out.println("你好年輕人");
		// }else if(age <= 40) {
		// System.out.println("你好中年人");
		// }else {
		// System.out.println("你好剩下的");
		// }
		/*
		 * 基本if結束
		 */

		/**
		 * 三元運算式開始
		 */
		// if (age > 20) {
		// System.out.println("大人");
		// } else {
		// System.out.println("小孩");
		// }
		//
		// System.out.println(age > 20 ? "大人" : "小孩");
		/*
		 * 三元運算式開始結束
		 */

		/*
		 * 兩次條件判斷開始
		 */
		// if (line.equals("jeff") && age == 123456) {
		// System.out.println("驗證成功，開始登入系統");
		// } else if (line.equals("jeff")) {
		// System.out.println("jeff密碼輸入錯誤");
		// } else if (age == 123456) {
		// System.out.println("密碼正確，使用者帳號錯誤");
		// } else {
		// System.out.println("錯誤資訊，請重新輸入");
		// }
		/*
		 * 兩次條件判斷結束
		 */

		/*
		 * Switch case
		 */
		// if (age <= 10) {
		// System.out.println("你好小朋友");
		// } else if (age <= 20) {
		// System.out.println("你好年輕人");
		// } else if (age <= 30) {
		// System.out.println("你好中年人");
		// } else if (age <= 40) {
		// System.out.println("你好中年人");
		// } else if (age <= 50) {
		// System.out.println("你好中年人");
		// } else if (age <= 60) {
		// System.out.println("你好中年人");
		// } else {
		// System.out.println("你好剩下的");
		// }

//		int roundedAge = age / 10;
//		switch (roundedAge) {
//		case 0:
//			
//		case 1:
//			System.out.println("你好小朋友");
//			break;
//		case 2:
//			System.out.println("你好年輕人");
//			break;
//		case 3:
//			System.out.println("你好中年人");
//			break;
//		default:
//			System.out.println("你好剩下的	");
//			break;
//
//		}

	}

	public void printNumber(int n) {
		if (n > 9)
			n = 9;
		for (int i = n; i <= n & i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
