import java.util.*;
class AvgofEvenOdd
{
	public static void main(String args[])
	{
		int n,i=1;
		double se=0,so=0,ce=0,co=0,ae,ao;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
		while(i<=n)
		{
			if(i%2==0)
			{
				se=se+i;
				ce++;
			}
			else
			{
				so=so+i;
				co++;
			}
			i++;
		}
		System.out.println("count of even no is : "+se);
		System.out.println("count of odd no is : "+so);

		ae=se/ce;
		ao=so/co;

		System.out.println("average of even no is : "+ae);
		System.out.println("average of odd no is : "+ao);
	}
}