package lesson_array;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 8;
		// System.out.println(a);

		int b;
		b = 10;

		int[] arr;
		arr = new int[10];
		// for(int i =0;i<arr.length;i++) {
		// System.out.println(arr[i]);
		// }
		System.out.println("arr length: " + arr.length);

		int[] arr3;
		arr3 = new int[5];
		System.out.println("arr3 length: " + arr3.length);

		arr3 = arr;
		System.out.println("arr length: " + arr.length);
		System.out.println("arr3 length: " + arr3.length);

		// Homework[] arr2;
		// arr2 = new Homework[2];
		// for(int j = 0;j<arr2.length;j++) {
		// System.out.println(arr2[j].rd());
		// }

	}

}
