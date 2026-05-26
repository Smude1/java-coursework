import java.util.*;
interface Salary
{
	final int Basic_Salary=60000;
	abstract void Basic_sal();
}
class Employee
{
	String name;
	int age;
	Scanner usa=new Scanner(System.in);
	void accept()
	{
		System.out.println("enter name and age");
		name=usa.next();
		age=usa.nextInt();
	}
	void display()
	{
		System.out.println("name is : "+name);
		System.out.println("age is : "+age);
	}
}
class Gross_Salary extends Employee implements Salary
{
	int TA,DA,HRA,GS;
	void get()
	{
		System.out.println("enter TA : ");
		TA=usa.nextInt();
		System.out.println("enter DA : ");
		DA=usa.nextInt();
		System.out.println("enter HRA : ");
		HRA=usa.nextInt();	
	}
	public void Basic_sal()
	{
		System.out.println("Basic salary is : "+Basic_Salary);
	}
	void Total_sal()
	{
		GS=Basic_Salary+TA+DA+HRA;
		System.out.println("Gross Salary is : "+GS);
	}
}
class Gross_SalaryAccess
{
	public static void main(String args[])
	{
		Gross_Salary gs=new Gross_Salary();
		gs.accept();
		gs.get();
		gs.display();
		gs.Basic_sal();
		gs.Total_sal();
	}
}