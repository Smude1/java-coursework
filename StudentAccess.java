import java.util.*;
class Student
{
	int a;	//instance variable
	int b;  	//instance variable
	static int c ;	//class variable 
	void get()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter value of a and b :");
		a=usa.nextInt();
		b=usa.nextInt();
		
		c=c+2;
	}
	void put()
	{
		int p=55;		//local variable
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		System.out.println("p is : "+p);
		System.out.println("c is : "+c);
	}
}
class StudentAccess
{
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.get();
		s2.get();
		System.out.println("....................................................");
		s1.put();
		System.out.println("....................................................");
		s2.put();
	}
}