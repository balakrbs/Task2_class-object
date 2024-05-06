package task2;

// Question no::1.4

public class Employee extends Person_inher{
	private int empid;
	private double salary;
	
	public Employee(String name, int age, int empid, double salary) {
		super(name, age);
		this.empid = empid;
		this.salary = salary;
	}
	public void displayinfo() {
		super.displayinfo();
		System.out.println("Employee ID : "+empid);
		System.out.println("Salary: "+salary);
	}
	
	public static void main(String args[]) {
		
		Employee emp=new Employee("Rahul",26,869,400000);
		System.out.println("Employee Details");
		emp.displayinfo();
	}

}
