import java.util.*;
class Numberr
{
	int n;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=usa.nextInt();
	}
	void sumdigit()
	{
		int digit=0,sum=0;
		while(n!=0)
		{
			digit= n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("\tthe sum of digits is : "+sum);
	}
	
}
class AccessNumberr
{
	public static void main(String args[])
	{
		Numberr num=new Numberr();
		num.accept();
		System.out.println("\t...............................");
		num.sumdigit();
		System.out.println("\t...............................");
		
	}
}