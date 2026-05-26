import java.util.*;
class Ternarydemo4
{
	public static void main(String args[])
	{
		
		Scanner uk=new Scanner(System.in);
		System.out.println("\n\n\tenter any character : ");
		String str1=uk.next();
		char ch=str1.charAt(0);
		if(ch>=65 && ch<=90)
		{
			System.out.println("\nis uppercase");
		}
		else
		{
			if(ch>=97 && ch<=122)
			{
				System.out.println("lowercase");
			}
			else
			{
				if(ch>=48 && ch<=57)
				{
					System.out.println("digit");
				}
				else
				{
					System.out.println("special symbol");
				}
			}
		}
	}
}