package day4_labbook;

public class ArrayElementLocation {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int result = findElementLocation(a,2);
		if(result == -1) {
			System.out.println("Your element doesn't exist in this array");
		}else {
			System.out.println("Your element exists at position "+result);
		}
	}
	
	public static int findElementLocation(int[] a,int b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b) {
				return i+1;
			}
		}
		return -1;
	}
}
