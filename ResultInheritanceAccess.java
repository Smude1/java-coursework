import java.util.*;
class StudentInheritance1
{
	int rollno;
	String name;
	Scanner usa=new Scanner(System.in);
	void accept()
	{
		System.out.println("enter rollno : ");
		rollno=usa.nextInt();	
		System.out.println("enter name : ");
		name=usa.next();
	}
	void display()
	{
		System.out.println("roll number is : "+rollno+"\nname is : "+name);
	}
}
class test extends StudentInheritance1
{
	int test1,test2;
	void get()
	{
		System.out.println("enter marks of test 1 and 2 : ");
		test1=usa.nextInt();
		test2=usa.nextInt();
	}
	void put()
	{
		System.out.println("marks of test 1 is : "+test1);	
		System.out.println("marks of test 2 is : "+test2);	
	}
}
class Result extends test
{
	int avg,total;
	void calculate()
	{
		total=test1+test2;
		avg=total/2;
		
		System.out.println("total is : "+total);
		System.out.println("average is : "+avg);		
	}
}

class ResultInheritanceAccess
{
	public static void main(String args[])
	{
		Result l1=new Result();
		l1.accept();
		l1.get();
		l1.display();
		l1.put();
		l1.calculate();
		
	}
}
