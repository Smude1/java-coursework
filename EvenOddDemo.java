import java.util.*;
class EvenOddDemo
{
	public static void main(String args[])
	{
		int n1;
		Scanner uk=new Scanner(System.in);
		System.out.println("\n\n\tenter the number : ");
		n1=uk.nextInt();
		if(n1%2==0)
		{
			System.out.println("\n\n\tnumber is even ");	
		}
		else
		{
			System.out.println("\n\n\tnumber is odd ");
		}
	}
}