package OprPack;
import java.util.*;
public class OperationPackClass
{
	int n,fact=1,sum=0;
	Scanner usa=new Scanner(System.in);
	public void getfact()
	{
		System.out.println("enter number for factorial : ");
		n=usa.nextInt();
	}
	public void putfact()
	{
		int i=1;
		while(i<=n)	
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+n+" is : "+fact);
	}
	public void sumnum()
	{
		int j;
		for(j=1;j<=n;j++)
		{
			sum=sum+j;
		}
		System.out.println("sum of first "+n+" numbers is : "+sum);
	}
}