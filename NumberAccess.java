import java.util.*;
class Number
{
	int n,i,fact=1;
	void get()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("\nenter the number to find factorial : ");
		n=usa.nextInt();
	}
	void put()
	{
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}		
		System.out.println("\n\tfactorial is : "+fact);
	}		
}
class NumberAccess
{
	public static void main(String args[])
	{
		Number n1=new Number();
		n1.get();
		System.out.println("\t...............................");
		n1.put();
		System.out.println("\t...............................");
	}
}