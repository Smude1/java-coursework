import java.util.*;
class person
{
	String name;
	int age;	
	Scanner usa;
	void get()
	{
		usa=new Scanner(System.in);
		System.out.println("enter person's name : ");
		name=usa.next();
		System.out.println("enter person's age: ");
		age=usa.nextInt();
	}
	void put()
	{
		 System.out.print("\t"+name+"\t"+age);
	}
}
class Employee extends person
{
	String desig;
	int salary;
	void accept()
	{
		System.out.println("enter employee designation : ");
		usa=new Scanner(System.in);
		desig=usa.next();
		System.out.println("enter employee salary: ");
		salary=usa.nextInt();
	}		
	void display()
	{
		System.out.println("\t"+desig+"\t"+salary);
	}
}
class EmployeeAccessInheri 
{
	public static void main(String args[])
	{
		Employee e1[]=new Employee[5];
		int i;
		for(i=0;i<5;i++)
		{
			e1[i]=new Employee();
			e1[i].get();
			e1[i].accept();
		}
		for(i=0;i<5;i++)	
		{
			e1[i].put();
			e1[i].display();
		}
		System.out.println("employee's salary grater than 5000 : ");
		for(i=0;i<5;i++)
		{
			if(e1[i].salary>=5000)
			{
				e1[i].put();
				e1[i].display(); 
			}
		}
	}
}