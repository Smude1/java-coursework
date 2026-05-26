import java.util.*;
class Teacher
{
	int a;
	int b;
	static int c;
	void get()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the value of a and b :");
		a=usa.nextInt();
		b=usa.nextInt();
		
		c=c+2;
		
	}
	void put()
	{
		int d=22;
		System.out.println("a is "+a);
		System.out.println("a is "+b);
		System.out.println("a is "+d);
		System.out.println("a is "+c);
	}
}
class TeacherAccess
{
	public static void main(String args[])
	{
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		t1.get();
		t2.get();
		t1.put();
		t2.put();
	}
}