package day4_labbook;

public class InvestmentCalculate {
	static int investment = 14000;
	
	public static void main(String[] args) {
		int investment = 14000;
		
		int result = investment + (investment * 40/100);
		
		System.out.println(result);
		
		result = result - 1500;
		System.out.println(result);
		
		result = result + (result * 12/100);
		System.out.println(result);
	}
	
}
