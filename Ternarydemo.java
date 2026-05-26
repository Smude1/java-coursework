import java.util.*;
class Ternarydemo
{
	public static void main(String args[])
	{
		int n1;
		Scanner uk=new Scanner(System.in);
		System.out.println("\n\n\tenter the number : ");
		n1=uk.nextInt();
		int rem=n1%2;
		String str1=(rem==0)?"number is even":"number is odd ";
		System.out.println(str1);
	}
}