package day4_labbook;

public class ReverseEachRowInTwoDimensional {
	public static void main(String[] args) {
		int[][] twoDiArr = {
				{1,2,3,4},
				{4,5,6,7},
				{2,3,4,5},
				{6,7,8,9}
		};
		
		for(int i=0;i<4;i++) {
//			System.out.println("I======="+i);
			int k = 3;
			int j = 0;
			while(j<k) {
//				System.out.println("J======="+j);
//				System.out.println("K======="+k);
				int temp = twoDiArr[i][j];
				twoDiArr[i][j] = twoDiArr[i][k];
				twoDiArr[i][k] = temp;
				k--;
				j++;
			}
		}
		
		for(int[] l:twoDiArr) {
			for(int m:l) {
				System.out.print(m+"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
