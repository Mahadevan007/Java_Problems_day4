package day4_labbook;

public class ReverseArrayElements {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		reverseArr(a);
		for(int i:a) {
			System.out.print(i+"\t"); 
		}
	}
	
	public static void reverseArr(int[] a) {
		int i = 0;
		int j = a.length-1;
		int temp;
		while(i!=j) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}
}
