package day4_labbook;

public class TwoDimensionalArray2 {
	static int[][] a = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
	};
	
	public static void main(String[] args) {
		System.out.println(a.length);
		int count = 0;
		int j = 0;
		for(int i=0;i<a.length;i++) {
			for(int k = 0;k<=count;k++) {
				System.out.print(a[i][j]+"\t");
			}
			count++;
			j++;
			System.out.println();
			System.out.println();
		}
	}
}
