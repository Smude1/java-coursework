import java.util.*;
class ArmstrongNo
{
	public static void main(String args[])
	{
		int sum=0,digit=0,n,original;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
		original=n;
		while(n!=0)
		{
			digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(sum==original)
		{
			System.out.println("\n\n\tits a armstrong number");
		}
		else
		{
			System.out.println("\n\n\tits a not armstrong number");
		}
	}
}