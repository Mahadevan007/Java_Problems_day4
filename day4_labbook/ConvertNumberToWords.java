package day4_labbook;

public class ConvertNumberToWords {
	public static void main(String[] args) {
		int number = 125;
		String[] digits = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
		int numlen = 0;
		int temp = number;
		while(temp!=0) {
			temp = temp/10;
			numlen++;
		}
		int[] resultArr = new int[numlen];
		int i = numlen-1;
		int temp2 = number;
		while(i>=0 && temp2 != 0) {
			int rem = temp2%10;
			temp2 = temp2/10;
			resultArr[i] = rem;
			i--;
		}
		for(int j:resultArr) {
			System.out.print(digits[j]+"\t");
		}
	}
}
