package Math_s;
import java.util.*;
public class Addition
{
	int a,b;
	Scanner usa=new Scanner(System.in);
	public void addget()
	{
		System.out.println("enter first number : ");
		a=usa.nextInt();
		System.out.println("enter second number : ");
		b=usa.nextInt();
	}
	public void addput()
	{
		System.out.println(" the addition of numbers is : "+(a+b));
	}
}