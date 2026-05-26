import java.util.*;
class EmployeePra
{
	int eid;
	String name;
	double sal;
	Scanner usa=new Scanner(System.in);
	void get()
	{
		System.out.println("enter employee id ,name and salary");
		eid=usa.nextInt();
		name=usa.next();
		sal=usa.nextDouble();
	}
	void put()
	{
		System.out.println("employee id is : "+eid);
		System.out.println("employee nams is : "+name);
		System.out.println("employee salary is : "+sal);
	}
}
class AccessEmployeePra
{
	public static void main(String args[])	
	{
		EmployeePra e[]=new EmployeePra[3];	
		for(int i=0;i<3;i++)
		{
			e[i]=new EmployeePra();
			e[i].get();
		}
		for(int i=0;i<3;i++)
		{
			e[i].put();
		}
	}
}