package day4_labbook;

public class StateOfObjectUsingFinal {
	public static void main(String[] args) {
		final Test obj = new Test();
		obj.a = 20;
		System.out.println(obj.a);//State can be changed when the obj is declared as final
		
//		obj = new Test();//But we cannot reassign the same declared variable with another object
	}
}

class Test {
	int a = 10;
}