package day4_labbook;

public class ManipulateProtectedData {
	public static void main(String[] args) {
		FirstClass firstclassobj = new FirstClass();
		SecondClass secondclassobj = new SecondClass();
		System.out.println(firstclassobj.number);
		secondclassobj.manipulate(firstclassobj);
		System.out.println(firstclassobj.number);
	}
}

class FirstClass {
	protected int number = 20;
}

class SecondClass {
	
	public void manipulate(FirstClass obj) {
		obj.number = 30;
	}
}
