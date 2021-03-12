package day4_labbook;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		boolean result = primeOrNot(6);
		System.out.println(result);
	}
	
	public static boolean primeOrNot(int number) {
		int count = 0;
		for(int i=1;i<=number;i++) {
			int result = number%i;
			if(result ==0) {
				count+=1;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
}
