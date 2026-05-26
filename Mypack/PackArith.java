package Mypack;
import java.io.*;
public class PackArith
{
	int a,b;
	public void inputdata()throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);
		System.out.println("enter first number : ");
		a=Integer.parseInt(usa.readLine());
		System.out.println("enter second number : ");
		b=Integer.parseInt(usa.readLine());
	}
	public void caldata()
	{
		System.out.println("Addition of numbers : "+(a+b));
		System.out.println("Subtraction of numbers : "+(a-b));
		System.out.println("Multiplication of numbers : "+(a*b));
		System.out.println("Division of numbers : "+(a/b));
	}
}
