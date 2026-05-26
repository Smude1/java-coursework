import java.util.*;
class pallindromeNo
{
	public static void main(String args[])
	{
		int rev=0,digit=0,n,original;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
		original=n;
		while(n!=0)
		{
			digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
		}
		System.out.println("reverse of digits is : "+rev);
		if(rev==original)
		{
			System.out.println("\n\n\tits a pallindrome number");
		}
		else
		{
			System.out.println("\n\n\tits a not pallindrome number");
		}
	}
}