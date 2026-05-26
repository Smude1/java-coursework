import java.util.*;
class ReverseNumber
{
	public static void main(String args[])
	{
		int n,rev=0,digit;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter any digit number : ");
		n=uk.nextInt();
		while(n!=0)
		{
			digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
			
		}	
		System.out.println("reverse of digits is : "+rev);
	}
}