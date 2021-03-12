package day4_labbook;

public class LargestElementInEachRow2DArray {
	static int[][] twoDiArr = {
			{1,2,3,4},
			{4,5,6,7},
			{2,3,4,5},
			{6,7,8,9}
	};
	
	public static void main(String[] args) {
		int[] resultArr = new int[4];
		for(int i=0;i<twoDiArr.length;i++) {
			int max = 0;
			for(int j=0;j<4;j++) {
				if(twoDiArr[i][j]>max) {
					max = twoDiArr[i][j];
				}
			}
			resultArr[i] = max;
		}
		for(int k=0;k<resultArr.length;k++) {
			System.out.println("Largest element in row "+(k+1)+" is "+resultArr[k]);
		}
	}
}
