package day4_labbook;

public class ExampleStudent {
	public static void main(String[] args) {
		Result res = new Result(80,70,95);
		int totalMark = res.calculateTotalMark();
		System.out.println(totalMark);
	}
}

class Student {
	String name;
	public int rollno;
}

class Exam extends Student {
	public int mathsMark;
	public int chemMark;
	public int phyMark;
}

class Result extends Exam {
	public int totalMark;
	
	public Result(int mathsMark,int chemMark,int phyMark) {
		this.mathsMark = mathsMark;
		this.chemMark = chemMark;
		this.phyMark = phyMark;
	}
	
	public int calculateTotalMark() {
		totalMark = mathsMark + chemMark + phyMark;
		return totalMark;
	}
}