package finalExam.inheritance;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB objB = new CB();
		objB.prime(100);
		objB.output();
	}

}

class CA {
	public ArrayList<Integer> numbers; // 因為不知道結果有幾個數字，使用ArrayList

	public void prime(int x) {
		numbers = new ArrayList<Integer>();//初始化numbers
		for (int i = 2; i <= x; i++) {//讓i從2開始，直到x結束, i=6
			boolean prime = true;
			for (int j = 2; j <= (i / 2); j++) {//讓j從2開始，直到i/2結束
				if (i % j == 0) {//如果i除以j可整除，就判定此數值非質數，並跳出迴圈
					prime = false;
					break;
				}
			}
			if (prime) {
				numbers.add(i);//如果是質數，將i新增到numbers內
			}
		}
	}
}

class CB extends CA {
	public void output() {
		for(int i=0;i<super.numbers.size();i++) {
//			System.out.println(super.numbers.get(i)+" ");
		}
		//b = super.numbers.get(i)
		for (int b : super.numbers) { // 此為For each寫法
			System.out.print(b + " ");
		}

	}
}