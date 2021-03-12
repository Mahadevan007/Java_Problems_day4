package day4_labbook;

public class WiproTest {
	public static void main(String[] args) {
		Wipro[] wiproArr = new Wipro[3];
		WiproTechnologies wiproobj1 = new WiproTechnologies(1000,20,15000,1,2,1998);
		wiproArr[0] = wiproobj1;
		System.out.println(wiproArr[0].getSalaryOfManager());
		WiproInfoTech wiproobj2 = new WiproInfoTech(2000,30,25000,2,2,2003);
		wiproArr[1] = wiproobj2;
		System.out.println(wiproArr[1].getSalaryOfManager());
		WiproBPO wiproobj3 = new WiproBPO(3000,25,10000,3,2,2001);
		wiproArr[2] = wiproobj3;
		System.out.println(wiproArr[2].getSalaryOfManager());
	}
}

class Wipro {
	int employeeCount;
	int managerCount;
	int minEmployeeSalary;
	Date dateOfCreating;
	
	public Wipro(int employeeCount, int managerCount,int minEmployeeSalary,int mm,int dd,int yy) {
		this.employeeCount =  employeeCount;
		this.managerCount = managerCount;
		this.minEmployeeSalary = minEmployeeSalary;
		this.dateOfCreating = new Date(mm,dd,yy);
	}
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public int getManagerCount() {
		return managerCount;
	}
	
	public int getMinimumEmployee() {
		return minEmployeeSalary;
	}
	
	public Date getDateofCreation() {
		return dateOfCreating;
	}
	
	public double getSalaryOfManager() {
		return minEmployeeSalary * 2.5;
	}
	
	class Date {
		int dd;
		int mm;
		int yy;
		
		public Date(int dd,int mm,int yy) {
			this.dd = dd;
			this.mm = mm;
			this.yy = yy;
		}
	}
}

class WiproTechnologies extends Wipro {

	public WiproTechnologies(int employeeCount, int managerCount, int minEmployeeSalary, int mm, int dd, int yy) {
		super(employeeCount, managerCount, minEmployeeSalary, mm, dd, yy);
		// TODO Auto-generated constructor stub
	}
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public int getManagerCount() {
		return managerCount;
	}
	
	public int getMinimumEmployee() {
		return minEmployeeSalary;
	}
	
	public Date getDateofCreation() {
		return dateOfCreating;
	}
	
	public double getSalaryOfManager() {
		return minEmployeeSalary * 3.5;
	}
}


class WiproInfoTech extends Wipro {

	public WiproInfoTech(int employeeCount, int managerCount, int minEmployeeSalary, int mm, int dd, int yy) {
		super(employeeCount, managerCount, minEmployeeSalary, mm, dd, yy);
		// TODO Auto-generated constructor stub
	}
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public int getManagerCount() {
		return managerCount;
	}
	
	public int getMinimumEmployee() {
		return minEmployeeSalary;
	}
	
	public Date getDateofCreation() {
		return dateOfCreating;
	}
	
	public double getSalaryOfManager() {
		return minEmployeeSalary * 3.0;
	}
	
}

class WiproBPO extends Wipro{

	public WiproBPO(int employeeCount, int managerCount, int minEmployeeSalary, int mm, int dd, int yy) {
		super(employeeCount, managerCount, minEmployeeSalary, mm, dd, yy);
		// TODO Auto-generated constructor stub
	}
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public int getManagerCount() {
		return managerCount;
	}
	
	public int getMinimumEmployee() {
		return minEmployeeSalary;
	}
	
	public Date getDateofCreation() {
		return dateOfCreating;
	}
	
	public double getSalaryOfManager() {
		return minEmployeeSalary * 4.0;
	}
	
}
