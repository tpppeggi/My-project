package finalExam;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB objB = new CB(10);
//		objB.testPro();
//		objB.alert();
		objB.show();
//		CA objA = new CA();
//		objA.alert();
//		CA objA2 = new CA(10);
	}

}

class CA {
	public int varX;
	private int publicVar = 10;

	public CA() {
		System.out.println("Execute parent constructor");
	}

	public CA(int i) {
		varX = i;
	}
	
	public void alert() {
		System.out.println("alert me");
	}
}

class CB extends CA {
	public int varX;

	public CB() {
		System.out.println("Execute child constructor");
	}

	public CB(int i) {
		/**
		 * 註解下面這行看看會有什麼分別?
		 * 父類別執行建構子的差異 
		 */
//		super(i);
		varX = 100;
		super.alert();
	}
	
	public void alert() {
		System.out.println("child alert");
	}
	
	public void testPro() {
		varX = 100;
		super.varX = 200;
//		System.out.println(super.publicVar);
//		System.out.println(super.publicVar);
	}

	public void show() {
		super.varX++;
		System.out.println("子類別 varX = " + varX);
		System.out.println("父類別 varX = " + super.varX);

	}
}
