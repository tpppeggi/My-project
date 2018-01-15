package finalExam.inheritance;
import java.lang.*;

public class Question2 {
	public static void main(String args[]) {
		CA2 objA = new CA2();
		CB2 objB = new CB2();
		objA.func(8);
		objB.func(8);
	}

}

class CA2 {
	public void func(int X) {
		System.out.println(X + "的3次方=" + (X * X * X));
	}

}

class CB2 extends CA2 {
	@Override
	public void func(int X) // Override
	{
		int result = 1;
		int q;
		q = X;
		while (q >= 1) {
			result = result * q;
			q--;
		}
		System.out.println(X + "!=" + result);
	}
}