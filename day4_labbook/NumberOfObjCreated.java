package day4_labbook;

public class NumberOfObjCreated {
	public static int numberOfObjects = 0;
	
	public NumberOfObjCreated() {
		numberOfObjects++;
	}
	
	public static void main(String[] args) {
		NumberOfObjCreated obj1 = new NumberOfObjCreated();
		NumberOfObjCreated obj2 = new NumberOfObjCreated();
		NumberOfObjCreated obj3 = new NumberOfObjCreated();
		NumberOfObjCreated obj4 = new NumberOfObjCreated();
		System.out.println(numberOfObjects);
	}
}
