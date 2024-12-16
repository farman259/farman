package Labprograms;
import java.util.Scanner;

 class Employee {
	private int id;
	private String name;
	private int salary;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int raiseSalary(int percent)
	{
		return this.salary=this.salary+ this.salary*percent/100;
	}
}
public class EmployeeDemo {
	public static void main(String[]args){

	Scanner scanner=new Scanner(System.in);
	int id;
	String name;
	int Salary;
	
	System.out.println("enter employee id,name,Salary");
	id=scanner.nextInt();
	name=scanner.next();
	Salary=scanner.nextInt();
	
	Employee employee=new
	Employee(id,name,Salary);
	System.out.println("enter percent raise");
	int percent=scanner.nextInt();
	int raisedSalary=employee.raiseSalary(percent);
	System.out.println("raised Salary:"+ raisedSalary);
}
}
	
