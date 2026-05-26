import java.util.*;
class Employee
{
	String name;
	double salary;
	void getdata()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter employee name : ");
		name=uk.next();
		System.out.println("enter employee basic salary : ");
		salary=uk.nextDouble();
	}
	void putdata()
	{
		
		System.out.println("\n\temployee name is : "+name+"\n\t"+"employee basic  salary is "+salary);
	}
}
class EmployeeAccess
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.getdata();
		System.out.println(".............................");
		e1.putdata();
		System.out.println(".............................");
	}
}