import java.util.*;
class EmployeeDetail {
	private String name;
	private float salary, hours;
	
	public EmployeeDetail() {
		name = " ";
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(String n, float sal, float hr) {
		name = n;
		salary = sal;
		hours = hr;
	}
	
	public float AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
return salary;
	}
	
	public float AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}
}
class TestEmployee {
	float salary;
	
	public TestEmployee(float sal) {
		salary = sal;
	}
	
	public void printSal() {
		System.out.println("Salary : " + salary);
	}
}
class a1q12
{
	public static void main (String[] args)
	{
		EmployeeDetail emp = new EmployeeDetail();
		
		/* taking input of employee details */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter salary");
		float salary = sc.nextFloat();
		System.out.println("Enter no. of hours of work");
		float hours = sc.nextFloat();
		
		/* calling methods of EmployeeDetail class */
		emp.getInfo(name, salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		
		TestEmployee test = new TestEmployee(salary);  /* pass salary obtained from the methods of the EmployeeDetail class as parameter */
		test.printSal();  /* calling method of TestEmployee class to print final salary */
	}
}
