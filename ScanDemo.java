import java.util.*;
class ScanDemo
{
	public static void main(String args[])
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter your name :");
		String name=usa.next();
		System.out.println("enter your rollno:");
		int rollno=usa.nextInt();
		System.out.println("enter your per:");
		double per=usa.nextDouble();
		
		System.out.println("your name :" +name);
		System.out.println("your rollno: " +rollno);
		System.out.println("your per :" +per);

	}
}