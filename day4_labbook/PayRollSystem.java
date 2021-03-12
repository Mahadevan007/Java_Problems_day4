package day4_labbook;

public class PayRollSystem {
	public static void main(String[] args) {
		Worker emp = new Worker("Maha", "Devan", 30, 20, 30000,10,01,1998);
		double workerEarnings = emp.earnings();
		System.out.println(workerEarnings);
		System.out.println(emp.dateOfJoining.getDate());
	}
}

class Employee {
	String firstName;
	String lastName;
	int hoursWorkedPerWeek;
	int daysWorked;
	int salary;
	int maxWorkingHoursPerWeek = 40;
	
	public Employee(String firstName,String lastName,int hoursWorkedPerWeek,int daysWorked,int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
		this.daysWorked =  daysWorked;
		this.salary = salary;
		this.maxWorkingHoursPerWeek = maxWorkingHoursPerWeek;
	}
}

class SalesPerson extends Employee {
	Date dateOfJoining;
	int maxWorkingHoursPerWeek = 50;
	
	public SalesPerson(String firstName, String lastName, int hoursWorkedPerWeek, int daysWorked, int salary, int dd,int mm,int yy) {
		super(firstName, lastName, hoursWorkedPerWeek, daysWorked, salary);
		// TODO Auto-generated constructor stub
		this.dateOfJoining = new Date(dd,mm,yy);
	}
	
	public double earnings() {
		if(this.hoursWorkedPerWeek <= this.maxWorkingHoursPerWeek) {
			return this.salary * this.hoursWorkedPerWeek;
		}else {
			return this.hoursWorkedPerWeek * this.salary * 0.5;
		}
	}
	
	class Date {
		int day;
		int month;
		int year;
		
		public Date(int dd,int mm,int yy) {
			this.day = dd;
			this.month = mm;
			this.year = yy;
		}
		
		public String getDate() {
			return this.day+"\'"+this.month+"\'"+this.year;
		}
	}
}

class SalesManager extends Employee {
	Date dateOfJoining;
	int maxWorkingHoursPerWeek = 40;
	
	public SalesManager(String firstName, String lastName, int hoursWorkedPerWeek, int daysWorked, int salary,int dd,int mm,int yy) {
		super(firstName, lastName, hoursWorkedPerWeek, daysWorked, salary);
		// TODO Auto-generated constructor stub
		this.dateOfJoining = new Date(dd,mm,yy);
	}
	
	public double earnings() {
		if(this.hoursWorkedPerWeek <= this.maxWorkingHoursPerWeek) {
			return this.salary * this.hoursWorkedPerWeek;
		}else {
			return this.hoursWorkedPerWeek * this.salary * 1.5;
		}
	}
	
	class Date {
		int day;
		int month;
		int year;
		
		public Date(int dd,int mm,int yy) {
			this.day = dd;
			this.month = mm;
			this.year = yy;
		}
		
		public String getDate() {
			return this.day+"\'"+this.month+"\'"+this.year;
		}
	}
}

class SalesTerritoryManager extends Employee {
	Date dateOfJoining;
	
	public SalesTerritoryManager(String firstName, String lastName, int hoursWorkedPerWeek, int daysWorked, int salary, int dd,int mm,int yy) {
		super(firstName, lastName, hoursWorkedPerWeek, daysWorked, salary);
		// TODO Auto-generated constructor stub
		this.dateOfJoining = new Date(dd,mm,yy);
	}
	
	public double earnings() {
		if(this.hoursWorkedPerWeek <= this.maxWorkingHoursPerWeek) {
			return this.salary * this.hoursWorkedPerWeek;
		}else {
			return this.hoursWorkedPerWeek * this.salary * 2.5;
		}
	}

	class Date {
		int day;
		int month;
		int year;
		
		public Date(int dd,int mm,int yy) {
			this.day = dd;
			this.month = mm;
			this.year = yy;
		}
		
		public String getDate() {
			return this.day+"\'"+this.month+"\'"+this.year;
		}
	}
}

class Worker extends Employee {
	Date dateOfJoining;
	int maxWorkingHoursPerWeek = 40;
	
	public Worker(String firstName, String lastName, int hoursWorkedPerWeek, int daysWorked, int salary, int dd,int mm,int yy) {
		super(firstName, lastName, hoursWorkedPerWeek, daysWorked, salary);
		// TODO Auto-generated constructor stub
		this.dateOfJoining = new Date(dd,mm,yy);
	}
	
	public double earnings() {
		if(this.hoursWorkedPerWeek <= this.maxWorkingHoursPerWeek) {
			return this.salary * this.hoursWorkedPerWeek;
		}else {
			return this.hoursWorkedPerWeek * this.salary * 1;
		}
	}


	
	class Date {
		int day;
		int month;
		int year;
		
		public Date(int dd,int mm,int yy) {
			this.day = dd;
			this.month = mm;
			this.year = yy;
		}
		
		public String getDate() {
			return this.day+"/"+this.month+"/"+this.year;
		}
	}
	
}