package day4_labbook;

public class Ascending_Descending {
	public static void main(String[] args) {
		int[] a = new int[] {5,4,3,2,1};
		a = ascending(a);
		System.out.println("Ascending ======== ");
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println();
		a = descending(a);
		System.out.println("Descending ========= ");
		for(int i:a) {
			System.out.println(i);
		}
		
	}
	
	public static int[] ascending(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					
				}
			}
		}
		return a;
	}
	
	public static int[] descending(int[] a) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j-1]<a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					
				}
			}
		}
		return a;
	}
}
