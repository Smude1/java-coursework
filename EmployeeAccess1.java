class Employee1
{
	int id;
	String name;
	Double sal;
	Employee1(int id,String name,double sal)
	{
		this.id=id;	//used 'this' keyword here
		this.name=name;
		this.sal=sal;
		this.display(); 	//this operation is known as nesting of member function
	}
	void display()
	{
		System.out.println("\n\temployee id is : "+id);
		System.out.println("\n\temployee name is : "+name);
		System.out.println("\n\temployee salary is : "+sal);
	}
}
class EmployeeAccess1
{
	public static void  main(String args[])
	{
		Employee1 e1=new Employee1(102,"amit",50000);
		
	}
}