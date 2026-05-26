package Math_s;
import java.util.*;
public class Subtraction
{
	int a,b;
	Scanner usa=new Scanner(System.in);
	public void subget()
	{
		System.out.println("enter first number : ");
		a=usa.nextInt();
		System.out.println("enter second number : ");
		b=usa.nextInt();
	}
	public void subput()
	{
		System.out.println(" the subtraction of numbers is : "+(a-b));
	}
}