import java.util.*;
class fibonacciDemo
{
	public static void main(String args[])
	{
		long a=0,b=1,c,i,n;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextLong();
		System.out.println(" fibonacci series is : \n");
		for(i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;	
		}

		
		
	}
}