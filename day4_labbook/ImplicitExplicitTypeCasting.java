package day4_labbook;

public class ImplicitExplicitTypeCasting {
	static boolean bool = true;
	static byte byt = 10;
	static char a = 'a';
	static short sht = 20;
	static int no = 450;
	static long lgno = 1223242;
	static float flt = 1.22f;
	static double dbl = 12.344343434;
	
	
	static int intdbl = (int) dbl;
	static float fltdbl = (float) dbl;
	static int intchar = (int) a;
	static float bytfloat = (float) byt;
	static float floatint = (float) no;
	public static void main(String[] args) {
		System.out.println(intdbl);
		System.out.println(fltdbl);
		System.out.println(intchar);
		System.out.println(bytfloat);
		System.out.println(floatint);
	}
}
