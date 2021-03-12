package day4_labbook;

public class ElementPresentOrNot {
	public static void main(String[] args) {
		int[] a = new int[] {1,2,2,3,4,5,6,6,5};
		int element = 6;
		int elementIndex = -1;
		int elementCount = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				elementIndex = i;
				elementCount++;
			}
		}
		if(elementIndex==-1) {
			System.out.println("The element doesn't exist in the array");
		}else {
			System.out.println("The element's last location is "+(elementIndex+1));
			System.out.println("The element's count is "+elementCount);
		}
	}
}
