import java.util.*;
class getpr
{
	int a,b;
	static int c;
	void get()
	{
	
		Scanner uk=new Scanner(System.in);
		System.out.println("enter value of a and b :");
		a=uk.nextInt();
		b=uk.nextInt();
		
		c=c+2;
	}
	void put()
	{
		int d=5;
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
		System.out.println("value of c is "+c);
		System.out.println("value of d is "+d);
	}	
}
class getprAccess
{
	public static void main(String args[])
	{
		getpr s1=new getpr();
		getpr s2=new getpr();
		getpr s3=new getpr();
		s1.get();
		s2.get();
		s3.get();
		System.out.println(".........................................");
		s1.put();
		s2.put();
		s3.put();
		System.out.println(".........................................");
	}
}