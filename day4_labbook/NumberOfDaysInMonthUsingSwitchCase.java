package day4_labbook;

public class NumberOfDaysInMonthUsingSwitchCase {
	static int month = 2;
	static int year = 2020;
	public static void main(String[] args) {
		switch(month) {
			case 1:
				System.out.println("31 days");
				break;
			
			case 2:
				boolean isLeapYear = false;
				if(year%100!=0) {
					if(year % 400 == 0) {
						isLeapYear = true;
					}else if(year % 4 == 0) {
						isLeapYear = true;
					}
				}
				if(isLeapYear) {
					System.out.println("29 days");
				}else {
					System.out.println("28 days");
				}
				break;
				
			case 3:
				System.out.println("31 days");
				break;
				
			case 4:
				System.out.println("30 days");
				break;
				
			case 5:
				System.out.println("31 days");
				break;
				
			case 6:
				System.out.println("30 days");
				break;
				
			case 7:
				System.out.println("31 days");
				break;
				
			case 8:
				System.out.println("31 days");
				break;
				
			case 9:
				System.out.println("30 days");
				break;
				
			case 10:
				System.out.println("31 days");
				break;
				
			case 11:
				System.out.println("30 days");
				break;
				
			case 12:
				System.out.println("31 days");
				break;
				
			default:
				System.out.println("Please enter a valid month");
				break;
		}
	}
}
