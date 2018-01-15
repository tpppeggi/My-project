package com.hom;
/*
 * 三角形邊驗證類別
 */
import java.util.Arrays;

public class ExciseIII {

	public static void main(String[] args) {
	}

	public class Homework {
		public int edge1;
		public int edge2;
		public int edge3;
		// public static int edge4 = 4;

		public Homework() {
			edge1 = 3;
			edge2 = 4;
			edge3 = 5;
		}

		public Homework(int a, int b, int c) {
			if (isLegal(a, b, c)) {
				edge1 = a;
				edge2 = b;
				edge3 = c;
			} else {
				edge1 = 3;
				edge2 = 4;
				edge3 = 5;
			}
		}

		/**
		 * 確認此三角形是否為直角三角形
		 * 
		 * @return
		 */
		public boolean isRightAngled() {
			if ((this.edge1 * this.edge1 + this.edge2 * this.edge2) == this.edge3 * this.edge3) {
				return true;
			}

			return false;
		}

		private boolean isLegal(int a, int b, int c) {

			int checked[] = { a, b, c };
			Arrays.sort(checked);
			this.edge1 = a;
			this.edge2 = b;
			this.edge3 = c;

			if (b - a <= c && c <= a + b) {
				return true;
			}
			return false;

		}

	}

}
