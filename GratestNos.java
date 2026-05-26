import java.util.*;
class GratestNos
{
	public static void main(String args[])
	{
		int n1,n2,n3;
		Scanner usa=new Scanner(System.in);
		System.out.println("\n\n\tenter 3 numbers : ");
		n1=usa.nextInt();
		n2=usa.nextInt();
		n3=usa.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("\n\n\tgratest no. is : "+n1);	
		}
		else
		{
			if(n2>n1 && n2>n3)
			{
				System.out.println("\n\n\tgratest no. is : "+n2);
			}
			else
			{
				System.out.println("\n\n\tgretest number is : "+n3);	
			}
		}
		
	}
}