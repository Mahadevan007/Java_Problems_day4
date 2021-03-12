package day4_labbook;

public class OrderOfInitialization {
	
	
	
	OrderOfInitialization(){
		System.out.println("Constructor called");
	}
	
	static {
		System.out.println("Static block 1");
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	//Static blocks always gets called first
	
	public static void main(String[] args) {
		OrderOfInitialization orderofinit = new OrderOfInitialization();
	}
	
}
