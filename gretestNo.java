import java.util.*;
class gretestNo
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the first number  :");
		n1=usa.nextInt();
		System.out.println("enter the second number  :");
		n2=usa.nextInt();
		if(n1>n2)
		{
			System.out.println("gretest number is :"+n1);
		}
		else
		{
			if(n2>n1)
			{
				System.out.println("gretest number is  :"+n2);
			}	
			else //if(n1==n2)
			{
				System.out.println("both are equal");
			}
		}	
		
	}
}