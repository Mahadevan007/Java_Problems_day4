package day4_labbook;

public class GeneratePrimeNumber1to100 {
	public static void main(String[] args) {
		for(int i =1;i<=100;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				int result = i%j;
				if(result==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(i+"\t");
			}
		}
	}
}
