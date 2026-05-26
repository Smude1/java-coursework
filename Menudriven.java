import java.util.*;
class Menudriven
{
	public static void main(String args[])
	{		
		int choice,a,b,cont;
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the value of a and b : ");
		a=uk.nextInt();
		b=uk.nextInt();
		do
		{
			System.out.println("enter 1 to perform addition : ");
			System.out.println("enter 2 to perform subtraction : ");
			System.out.println("enter 3 to perform multiplication : ");
			System.out.println("enter 4 to perform division : ");
			System.out.println("enter 5 to perform modulus : ");
			
			System.out.println("\nenter your choice : ");
			choice=uk.nextInt();
			
			switch(choice)
			{
				case 1 : 
					System.out.println("\n\taddition is : "+(a+b));
					break;
				case 2 : 
					System.out.println("\n\tsubtraction is : "+(a-b));
					break;
				case 3 : 
					System.out.println("\n\tmultiplication is : "+(a*b));
					break;
				case 4 : 
					System.out.println("\n\tdivision is : "+(a/b));
					break;
				case 5 : 
					System.out.println("\n\tmodulus is : "+(a%b));
					break;
				default : 
					System.out.println("entered choice is wrong ");
			}
			System.out.println("u want to continue?press 1");
			cont=uk.nextInt();
		}
		while(cont==1);

	}
}