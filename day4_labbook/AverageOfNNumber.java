package day4_labbook;

public class AverageOfNNumber {
	public static void main(String[] args) {
		int average = averageOfN(5);
		System.out.println(average);
	}
	
	public static int averageOfN(int n) {
		int result = 0;
		for(int i=1;i<=n;i++) {
			result = result + i;
		}
		result = result/n;
		return result;
	}
}
