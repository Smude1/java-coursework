import java.util.*;
class LineArguDemo
{
	public static void main(String args[])
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);

		System.out.println("Adition of the numbers is : "+(a+b));
		System.out.println(" subtraction of the numbers is : "+(a-b));
		System.out.println(" multiply of the numbers is : "+(a*b));
		System.out.println(" division of the numbers is : "+(a/b));
		
		System.out.println(" \n\tboolean value of the numbers is : "+(a<b));
		System.out.println("\n\t boolean value of the numbers is : "+(a>b));
		System.out.println("\n\t boolean value of the numbers is : "+(a<=b));
		System.out.println(" \n\tboolean value of the numbers is : "+(a>=b));
		System.out.println(" \n\tboolean value of the numbers is : "+(a==b));
		System.out.println(" \n\tboolean value of the numbers is : "+(a!=b));
	}
}
