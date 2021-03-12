package day4_labbook;

public class PassByValueandPassByReference {
	static int number = 10;
	static char character = 'a';
	static int[] arr = {1,2,3,4};
	
	public static void main(String[] args) {
		System.out.println("Before Changing Number = "+number+" Character = "+character);
		System.out.println("Before Changing Array ====== ");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println();
		modifyData(number,character);
		modifyArr(arr);
		System.out.println("After Changing Number = "+number+" Character = "+character);
		System.out.println("After Changing Array ====== ");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
	}
	
	public static void modifyData(int a,char b) {
		a = 20;
		b = 'b';
	}
	
	public static void modifyArr(int[] arr) {
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
	}
}
