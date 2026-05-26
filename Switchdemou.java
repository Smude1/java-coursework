import java.util.*;
class Switchdemou	
{
	public static void main(String args[])
	{
		int i;
		Scanner uk=new Scanner(System.in);
		System.out.println(" press 1 for name :");
		System.out.println("press 2 for surname : ");
		System.out.println("enter your choice : ");
		int choice=uk.nextInt();
		switch(choice)
		{
			case 1: 
				System.out.println("\n\tsuraj");
				break;
			case 2 : 
				System.out.println("\n\tmude");
				break; 
			default:
				System.out.println("\n\tnothing to show");
				break;
			
		}
		System.out.println("\n\tthats all ! ");
	
	
	}


}