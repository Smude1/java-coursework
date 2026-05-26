class StudentInheritance
{
	int rollno;
	String name;
	void accept()
	{
		rollno=101;
		name="Suraj";	
	}
	void display()
	{
		System.out.println("roll number is : "+rollno+"\nname is : "+name);
	}
}
class library extends StudentInheritance
{
	int memberno;
	void get()
	{
		memberno=12345;
	}
	void put()
	{
		System.out.println("member number is : "+memberno);	
	}
}
class libraryInheritanceAccess
{
	public static void main(String args[])
	{
		library l1=new library();
		l1.accept();
		l1.display();
		l1.get();
		l1.put();
		
	}
}
