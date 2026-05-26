import java.util.*;
class Number4
{
	int n;
	void get()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
	}
	void pallindrome()
	{
		int digit=0,rev=0,orig;
		orig=n;
		while(n!=0)
		{
			digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
		}
		System.out.println("reverse is :  "+rev);
		if(rev==orig)
		{
			System.out.println("its pallindrome number ");
		}
		else
		{
			System.out.println("its not pallindrome number ");
		}
	}
	void armstrong()
	{
		int sum=0,digitt=0;
		int original=n;
		while(n!=0)
		{
			digitt=n%10;
			sum=sum+(digitt*digitt*digitt);
			n=n/10;
		}
		if(sum==original)
		{
			System.out.println("\nits a armstrong number");
		}
		else
		{
			System.out.println("\nits a not armstrong number");
		}
	}
}
class Number4Access
{
	public static void  main(String args[])
	{
		Number4 n=new Number4();
		n.get();
		n.pallindrome();
		n.armstrong();
	}
}