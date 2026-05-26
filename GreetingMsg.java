import java.util.*;
class GreetingMsg
{
	public static void main(String args[])
	{		
		int marks;
		Scanner uk=new Scanner(System.in);
		System.out.println("\nenter your marks : "); 
		marks=uk.nextInt();
		marks=marks/10;
		
		switch(marks)
		{
			case 10 : 
			case 9 :
			case 8 :
				System.out.println("Excellent performance !");
				break;
			case 7 : 
				System.out.println("very good !");
				break;
			case 6 : 
				System.out.println("good !");
				break;
			case 5 : 
				System.out.println("work hard ");
				break;
			case 4 :
				System.out.println("poor performance ");
				break;
			case 3 :
			case 2 :
			case 1 :
			case 0 :
				System.out.println("very poor ");
				break;
			default : 
				System.out.println("entered choice is wrong ");
		}
	}
}