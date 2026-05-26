import java.util.*;
class Number2
{
	int n;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the number ");
		n=usa.nextInt();
	}
	void evenodd()
	{
		if(n%2==0)
		{
			System.out.println("\tthe number is even");
		}
		else
		{
			System.out.println("\tthe number is odd ");
		}
	}
	void prime()
	{
		int i,m=0,flag=0;
		m=n/2;
		
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("\tit is not prime number ");
				flag=1;
				break;
			}
		}
		if(flag==0)	
		{
			System.out.println("\tit is prime number ");
		}
			
	}
}
class AccessNumber2
{
	public static void  main(String args[])
	{
		Number2 num2=new Number2();
		num2.accept();
		System.out.println("\t...............................");
		num2.evenodd();
		System.out.println("\t...............................");
		num2.prime();
		System.out.println("\t...............................");
	}
}
