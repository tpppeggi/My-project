package lesson_array;

public class SelectionSort {
	public static void main(String[] argv) {
        int[] data = {6, 3, 7, 1, 4, 8};
        sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
    public static void sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            // find minimum in i ~ data.length - 1
			int min = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[min] > data[j]) {
                    min = j;
                }
            }
            // swap data[i] with data[min]
            int tmp = data[i];
            data[i] = data[min];
            data[min] = tmp;
        }
    }
}
