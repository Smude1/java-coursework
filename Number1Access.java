import java.util.*;
class Number1
{
	int x,n;
	void in()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter value of x : ");
		x=uk.nextInt();
		System.out.println("enter value of n : ");
		n=uk.nextInt();
	}
	void out()
	{
		System.out.println("\tthe x^n result is : "+Math.pow(x,n));
	}
}
class Number1Access
{
	public static void main(String args[])
	{
		Number1 num=new Number1();
		num.in();
		System.out.println("\t...............................");
		num.out();
		System.out.println("\t...............................");
	}
}