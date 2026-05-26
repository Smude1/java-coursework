import java.util.*;
class DigitsSum
{
	public static void main(String args[])
	{
		int digit=0,sum=0,n;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
		while(n!=0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			
		}
		System.out.println("sum of digits is : "+sum);
	}
}