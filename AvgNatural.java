import java.util.*;
class AvgNatural
{
	public static void main(String args[])
	{
		int n,i=0,sum=0,avg;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=uk.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		avg=sum/n;
		System.out.println("sum is : "+sum);
		System.out.println("average is : "+avg);
	}
}