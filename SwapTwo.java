import java.util.*;
class SwapTwo
{
	public static void main(String args[])
	{
		int x,y;
		Scanner nz=new Scanner(System.in);
		System.out.println("enter values of x and y");
		x=nz.nextInt();
		y=nz.nextInt();
		System.out.println("\n\tbefore swap :");
		System.out.print("x is :"+x + "\ny is :"+y);

		x=x+y;
		y= x-y;
		x=x-y;
		
		System.out.println("\n\tafter swap :");
		System.out.print("x is :"+x + "\ny is :"+y);

		
	}
}