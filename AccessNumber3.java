import java.util.*;
class Number3
{
	int n;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the number : ");
		n=usa.nextInt();
	}
	void reverse()
	{	
		int rev=0,digit;
		System.out.println("number is :  "+n);
		while(n!=0)
		{
			digit=n%10;
			rev=(rev*10)+digit;
			n=n/10;
			
		}
		System.out.println("count of digits is : "+rev);
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
class AccessNumber3
{
	public static void main(String args[])
	{
		Number3 num=new Number3();
		num.accept();
		System.out.println("\t...............................");
		num.sumdigit();
		System.out.println("\t...............................");
		num.reverse();
		System.out.println("\t...............................");
	}
}