import java.util.*;
class DayDisplay
{
	public static void main(String args[])
	{		
		int choice;
		Scanner uk=new Scanner(System.in);

		System.out.println("\nenter month number  : "); 
		choice=uk.nextInt();
		
		switch(choice)
		{
			case 1 : 
				System.out.println("its a january ! ");
				break;
			case 2 : 
				System.out.println("its a february ");
				break;
			case 3 : 
				System.out.println("its a march !");
				break;
			case 4 : 
				System.out.println("its a april !");
				break;
			case 5 :
				System.out.println("its a may ! ");
				break;
			case 6 :
				System.out.println("its a june !");
				break;
			case 7:
				System.out.println("its july ! ");
			default : 
				System.out.println("enter numbers between 1 to 7 ");
		}
	}
}