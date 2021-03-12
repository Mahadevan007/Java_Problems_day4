package day4_labbook;

public class TestSingleton {
	public static void main(String[] args) {
		Singleton single1 = Singleton.getInstance();
		single1.a = 20;
		System.out.println(single1.a);
		Singleton single2 = Singleton.getInstance();
		single2.a = 30;
		System.out.println(single1.a);
		System.out.println(single2.a);
	}
}


class Singleton {
	public int a = 10;
	static Singleton single = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return single;
	}
}