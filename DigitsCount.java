import java.util.*;
class DigitsCount
{
	public static void main(String args[])
	{
		int count=0,n;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("count of digits is : "+count);
	}
}