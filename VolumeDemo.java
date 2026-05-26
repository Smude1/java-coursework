import java.util.*;
class VolumeDemo
{
	public static void main(String args[])
	{		
		int choice;
		double lgt,wdh,hgt , radius;
		Scanner uk=new Scanner(System.in);

		System.out.println("enter 1 for volume of box: ");
		System.out.println("enter 2 for volumeof sphere: ");
		System.out.println("enter 3 for volume of cylender: ");
		System.out.println("enter 4 for volume of cone : ");
		
		System.out.println("\nenter your choice : "); 
		choice=uk.nextInt();
		
		switch(choice)
		{
			case 1 : 
				System.out.println("enter the length ,width & height of box : ");
				lgt=uk.nextDouble();
				wdh=uk.nextDouble();
				hgt=uk.nextDouble();
				System.out.println("volume of box is : "+(lgt*wdh*hgt));
				break;
			case 2 : 
				System.out.println("enter radius of sphere : ");
				radius=uk.nextDouble();
				System.out.println("volume of sphere is  : "+((4/3)*3.14*radius*radius));
				break;
			case 3 : 
				System.out.println("enter radius and height of cylender  : ");
				radius=uk.nextDouble();
				hgt=uk.nextDouble();
				System.out.println("volume of cylender is : "+(3.14*radius*radius*hgt));
				break;
			case 4 : 
				System.out.println("enter height and radius of cone ");
				hgt=uk.nextDouble();
				radius=uk.nextDouble();
				System.out.println("volume of cone is : "+(1/3*3.14*(radius*radius)*hgt));
				break;
			default : 
				System.out.println("entered choice is wrong ");
		}
	}
}