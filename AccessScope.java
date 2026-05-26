import java.util.*;
class Scope
{
	int a;
	int b;
	static int c;
	void in()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("Enter the value of a anf b : ");
		a=usa.nextInt();
		b=usa.nextInt();
		c=c+2;
	}
	void display()
	{
		int d=5;
		System.out.println("a is : "+a+"\nb is :  "+b+"\nc is :"+c+"\nd is : "+d);
	}
}
class AccessScope 
{
	public static void main(String args[])
	{
		Scope s1=new Scope();
		Scope s2=new Scope();
		
		s1.in();
		s1.display();
		s2.in();
		s2.display();
		
	}
}