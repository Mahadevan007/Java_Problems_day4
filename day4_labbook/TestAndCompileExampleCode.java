package day4_labbook;

public class TestAndCompileExampleCode {
	public static void main(String[] args) {
		
	}
}

//protected class base { This will throw error since class cannot be declared with private or 
// protected access specifiers. either public or default.
class base{
	String Method() {
		return "Wow";
	}
}

class derived {
	public void useD() {
		base z = new base();
		System.out.println("base says, "+z.Method());
	}
}
