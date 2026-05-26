import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		int x1,y1,z1;
		Scanner aus=new Scanner(System.in);
		System.out.println("\n\n\tenter value of x1:");
		x1=aus.nextInt();
		System.out.println("\n\n\tenter value of y1 :");
		y1=aus.nextInt();

		System.out.println("\n\n\tbefore exchange  :" );
		System.out.println("x1 is : "+x1 +"\ty1 is :"+y1);

		z1=x1;
		x1=y1;
		y1=z1;

		System.out.println("\n\n\tafter exchange ");
		System.out.println("x1 is : "+x1 +"\ty1 is :"+y1);
	}
}