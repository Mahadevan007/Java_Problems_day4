package day4_labbook;

public class ResultOfStudents {
	static int[][] student_marks = {
			{40,50,45,60,70},
			{60,60,45,60,70},
			{70,80,89,48,70},
			{40,55,90,60,70},
	};
	static int[] result = new int[4];
	
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<student_marks.length;i++) {
			for(int j=0;j<5;j++) {
				sum = sum + student_marks[i][j];
			}
			result[i] = sum;
			sum = 0;
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println("Student "+(i+1)+" mark is "+result[i]);
		}
	}
}
