package lesson_array;

public class InsertionSort {
	public static void main(String[] argv) {
        int[] data = {4, 1, 7, 8, 9, 3, 2};
        sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    public static void sort(int[] data) {
        int j, pivot;
        // insert data[i] to sorted array 0 ~ i - 1
        // begins from i = 1, because if the array has only one element then it must be sorted.
        for (int i = 1; i < data.length; i++) { 
            pivot = data[i];
            for (j = i - 1; j >= 0 && data[j] > pivot; j--) { 
                // shift data[j] larger than pivot to right
                data[j+1] = data[j];
            }
            data[j+1] = pivot; 
        }
    }
}
