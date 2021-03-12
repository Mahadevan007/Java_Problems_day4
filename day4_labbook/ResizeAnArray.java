package day4_labbook;

public class ResizeAnArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		int count = 1;
		for(int j=0;j<a.length;j++) {
			a[j] = count;
			count = count + 1;
		}
		System.out.println("Size of the array ===== "+a.length);
		System.out.println("Elements of the array ====");
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println();
		a = (int[]) resizeArr(a,10,a.length);
		System.out.println("New Size of the array ===== "+a.length);
		System.out.println("New Elements of the array ====");
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	public static Object resizeArr(Object a,int newsize,int oldsize) {
		int[] copy = new int[newsize];
		System.arraycopy(a, 0, copy, 0, oldsize);
		return copy;
	}
}
