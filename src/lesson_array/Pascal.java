package lesson_array;

public class Pascal {
	public static void main(String[] argv) {
        int n, i, j;
        int[][] tri = new int[51][51];
        n = Integer.parseInt(argv[0]);
        if (n < 0 || n > 50) {
            System.out.println("I can only print Pascal triangle between 0 and 50.\n");
        } else {
            for (i = 0; i <= n; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print("  "+(tri[i][j] = (j==0 || j==i) ? 1 : tri[i-1][j-1]+tri[i-1][j]));
                }
                System.out.println();
            }
        }
    }
}
