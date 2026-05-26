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
	void accept()
	{
		name="Suraj mude";
		age=17;
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
		TA=(Basic_Salary*18)/100;
		DA=(Basic_Salary*20)/100;
		HRA=(Basic_Salary*25)/100;
	}
	public void Basic_sal()
	{
		System.out.println("Basic salary is : "+Basic_Salary);
	}
	void Total_sal()
	{
		GS=Basic_Salary+TA+DA+HRA;
		System.out.println("TA is : "+TA);
		System.out.println("DA is : "+DA);
		System.out.println("HRA is : "+HRA);
		System.out.println("Gross Salary is : "+GS);
	}
}
class Gross_SalaryAccess1
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