package day4_labbook;

public class TestClassWithAccessSpecifiers {
	public static void main(String[] args) {
		TestClass test = new TestClass();
		System.out.println(test.number);
		//System.out.println(test.number2); This will throw error since private members are not accessible
		System.out.println(test.number3);
		test.met1();
		//test.met2(); This will throw error since private methods are not accessible
		test.met3();
	}
}

class TestClass {
	public int number = 10;
	private int number2 = 20;
	protected int number3 = 30;
	
	public void met1() {
		System.out.println("Method 1");
	}
	
	private void met2() {
		System.out.println("Method 2");
	}
	
	protected void met3() {
		System.out.println("Method 3");
	}
}
