import java.util.*;
class PackageDemo
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your name :");
		String name=s1.next();
		System.out.println("enter your rollno :");
		int rollno=s1.nextInt();
		System.out.println("enter your per :");
		double per=s1.nextDouble();
		
		
		System.out.println("name is :" +name);
		System.out.println("rollno is :" +rollno);
		System.out.println("per is :" +per);
	}
}