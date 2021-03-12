package day4_labbook;

public class ArmstrongPerfectPalindrome {
	static int number = 6;
	
	public static void main(String[] args) {
		boolean isarmstrong = armstrongNumber(number);
		boolean isperfectnumber = perfectNumber(number); 
		boolean ispalindrome = palindrome(number);
		if(isarmstrong) {
			System.out.println("The number is an armstrong number");
		}
		if(isperfectnumber) {
			System.out.println("The number is a perfect number");
		}
		if(ispalindrome) {
			System.out.println("The number is a palindrome");
		}
		
		if(!isarmstrong && !isperfectnumber && !ispalindrome) {
			System.out.println("The number is none of these");
		}
	}
	
	public static boolean palindrome(int n) {
		int numlen=0;
		int copy = n;
		while(copy!=0) {
			copy = copy / 10;
			numlen++;
		}
		if(numlen>1) {
			int temp = n;
			int result = 0;
			while(temp!=0) {
				int rem = temp % 10;
				result = result * 10 + rem;
				temp = temp / 10;
			}
			if(result == n) {
				return true;
			}
		}
//		System.out.println("Plaindrom ==== "+result);
		return false;
	}
	
	public static boolean perfectNumber(int n) {
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum = sum + i;
			}
		}
//		System.out.println(sum);
//		System.out.println(n);
		if(sum == n) {
			return true;
		}
		return false;
	}
	
	
	public static boolean armstrongNumber(int n) {
		int numlen=0;
		int copy = n;
		while(copy!=0) {
			copy = copy / 10;
			numlen++;
		}
//		System.out.println(numlen);
		if(numlen > 1) {
			int result = 0;
			int temp = n;
			while(n!=0) {
				int rem = n % 10;
				result = result + power(rem,numlen);
				n = n / 10;
			}
//		System.out.println(temp);
//		System.out.println(result);
			if(temp == result) {
				return true;
			}
		}
		return false;
	}
	
	public static int power(int n,int power) {
		int result = 1;
		while(power!=0) {
			result = result * n;
			power--;
		}
//		System.out.println(result);
		return result;
	}
	
}
