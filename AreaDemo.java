import java.util.*;
class AreaDemo
{
	public static void main(String args[])
	{		
		int choice;
		double side,lgh,bri,radi,base,hgt;
		Scanner uk=new Scanner(System.in);

		System.out.println("enter 1 for area of square : ");
		System.out.println("enter 2 for area of rectangle : ");
		System.out.println("enter 3 for area of circle : ");
		System.out.println("enter 4 for area of triangle : ");
		
		System.out.println("\nenter your choice : "); 
		choice=uk.nextInt();
		
		switch(choice)
		{
			case 1 : 
				System.out.println("enter the sides of square : ");
				side=uk.nextDouble();
				System.out.println("area of square is : "+(side*side));
				break;
			case 2 : 
				System.out.println("enter length and breadth : ");
				lgh=uk.nextDouble();
				bri=uk.nextDouble();
				System.out.println("area of rectangle is : "+(lgh*bri));
				break;
			case 3 : 
				System.out.println("enter radius of circle : ");
				radi=uk.nextDouble();
				System.out.println("area of circle is : "+(3.14*radi*radi));
				break;
			case 4 : 
				System.out.println("enter base and height ");
				base=uk.nextDouble();
				hgt=uk.nextDouble();
				System.out.println("area of triangle is : "+((base*hgt)/0.2));
				break;
			default : 
				System.out.println("entered choice is wrong ");
		}
	}
}