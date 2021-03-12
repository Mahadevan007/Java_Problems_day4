package day4_labbook;

public class AccessSpecifierExample1 {
	public static void main(String[] args) {
		B b = new B();
		b.met4();
		System.out.println(b.number1);
		System.out.println(b.number3);
	}
}

class A {
	public int number1 = 10;
	private int number2 = 20;
	protected int number3 = 30;
	
	public void met1() {
		System.out.println("Method 1 is called");
	}
	
	private void met2() {
		System.out.println("Method 2 is called");
	}
	
	protected void met3() {
		System.out.println("Method 3 is called");
	}
}

class B extends A {
	int bnumber1 = 10;
	
	public void met4() {
		//super.number2 = 10; Will throw error since private variables cannot be accessed
		super.number1 =  20;
		super.number3 = 30;
		super.met1();
		super.met3();
	}
}