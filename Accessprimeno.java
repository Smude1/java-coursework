import java.util.*;
class primeno
{
	int n;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=usa.nextInt();
	}	
	void Calculate()
	{
		int i,m=0,flag=0;
		m=n/2;
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("it is not prime number : "+n);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("prime number is :  "+n);
		}
	}
}
class Accessprimeno
{
	public static void main(String args[])
	{
		primeno p1=new primeno();
		p1.accept();
		p1.Calculate();
	}
}