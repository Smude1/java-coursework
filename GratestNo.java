import java.util.*;
class GratestNo
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner usa=new Scanner(System.in);
		System.out.println("\n\n\tenter the number : ");
		n1=usa.nextInt();
		n2=usa.nextInt();
		if(n1>n2)
		{
			System.out.println("\n\n\tgratest no. is : "+n1);	
		}
		else
		{
			if(n2>n1)
			{
				System.out.println("\n\n\tgratest no. is : "+n2);
			}
			else
			{
				System.out.println("\n\n\tboth are equal");	
			}
		}
		
	}
}