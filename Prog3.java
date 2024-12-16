package nithinr;
import java.util.Scanner;



class employee {
	private int id;
	private String name;
	private int salary;
	public employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int raisesalary(int percent)
	{
		return this.salary+this.salary*percent/100;
	}
}
public class Prog3 {
	public static void main(String[]args){
	Scanner scanner=new Scanner(System.in);
	int id;
	String name;
	int Salary;
	
	System.out.println("enter employee id,name,Salary");
	id=scanner.nextInt();
	name=scanner.next();
	Salary=scanner.nextInt();
	
	employee employee=new
	employee(id,name,Salary);
	System.out.println("enter percent raise");
	int percent=scanner.nextInt();
	int raisedSalary=employee.raisesalary(percent);
	System.out.println("raised salary:"+raisedSalary);
}
}
	


