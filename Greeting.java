import java.util.*;
class Greeting
{
	public static void main(String args[])
	{		
		int marks;
		Scanner uk=new Scanner(System.in);
		System.out.println("\nenter your marks : "); 
		marks=uk.nextInt();
		
		if(marks>=80 || marks<=100)
		{
			System.out.println("\nexcellent performance ! "); 	
		}
		else
		{
			if(marks>=70 || marks<=79)
			{
				System.out.println("\nvery good ! "); 		
			}
			else
			{
				if(marks >=60 || marks<=69)
				{
					System.out.println("\ngood ! "); 	
				}
				else
				{
					if(marks>=50 || marks<=59)
					{
						System.out.println("\nwork hard! "); 	
					}
					else
					{
						if(marks>=40 || marks<=49)
						{
							System.out.println("\npoor performance "); 	
						}	
						else
						{
							if(marks>=0 || marks <=39)
							{
								System.out.println("\nvery poor "); 	
							}
						}
					}
				}
			}
		}
	}
}