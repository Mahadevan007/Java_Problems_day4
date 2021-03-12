package day4_labbook;

public class TwoDimensionalArray1 {
	static int[][] a = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
	};
	
	public static void main(String[] args) {
		System.out.println(a.length);
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
	
}
