package day4_labbook;

public class AddComplexNumbers {
	public static void main(String[] args) {
		Complex cmpl1 = new Complex(2.0,5.0);
		Complex cmpl2 = new Complex(3.0,4.0);
		Complex temp;
		
		temp = add(cmpl1,cmpl2);
		System.out.println("Sum = "+temp.real+" + "+temp.img+"i");
	}
	
	public static Complex add(Complex n1,Complex n2) {
		Complex temp = new Complex();
		temp.real = n1.real + n2.real;
		temp.img = n1.img + n2.img;
		return temp;
	}
}

class Complex {
	double real;
	double img;
	
	public Complex() {
		this.real = 0.0;
		this.img = 0.0;
	}
	
	public Complex(double real,double img) {
		this.real = real;
		this.img = img;
	}
	
}