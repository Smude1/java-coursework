import java.util.*;
class EvenOddDigitSum
{
	public static void main(String args[])
	{
		int i=1,n,sumeven=0,sumodd=0;
		
		System.out.println("enter any digit number : ");
		Scanner usa=new Scanner(System.in);
		n=usa.nextInt();
		while(i<=n)
		{
			if(i%2==0)
			{
				sumeven=sumeven+i;
				
			}
			else
			{
				sumodd=sumodd+i;
				
			}
			i++;
		}
		System.out.println("sum of even digit is : "+sumeven);
		System.out.println("sum of odd digit is : "+sumodd);
	}
}