package day4_labbook;

public class ModifyConstMember {
	static int b = 20;
	
	public static void main(String[] args) {
		final int a = 10;
		//newClass obj = new newClass(); This will throw error, either we have to create a 
		//empty constructor or add parameter while initializing. 
		//a = 20; This will throw error since final variable cannot be changed
	}
	
	public void met() {
		System.out.println(b);
	}
}

class newClass{
	public newClass(int i) {
		System.out.println("Constructor with params called");
	}
}
