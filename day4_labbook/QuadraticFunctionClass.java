package day4_labbook;

public class QuadraticFunctionClass {
	public static void main(String[] args) {
		QuadraticFunction qfunc = new QuadraticFunction();
		System.out.println(qfunc.geta());
		System.out.println(qfunc.getb());
		System.out.println(qfunc.getc());
		qfunc.modifyValues(2, 4, 9);
		int result = qfunc.compute(3);
		System.out.println("Result  ==== "+result);
		QuadraticFunction qfunc2 = new QuadraticFunction(2,3,4);
		result = qfunc2.compute(5);
		System.out.println("Result 2 ====== "+result);
	}
}

class QuadraticFunction {
	public int a;
	public int b;
	public int c;
	
	public QuadraticFunction() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}
	
	public QuadraticFunction(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void modifyValues(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int compute(int x) {
		int result;
		result = this.a*(x*x)+this.b*x+c;
		return result;
	}
	
	public int geta() {
		return this.a;
	}
	
	public int getb() {
		return this.b;
	}
	
	public int getc() {
		return this.c;
	}
}
