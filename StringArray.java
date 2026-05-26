import java.util.*;
class StringArray
{
	public static void main(String args[])
	{
		
		Scanner usa=new Scanner(System.in);
		String str[]=new String[10];
		System.out.println("Enter 5 names : ");
		for(int i=0;i<str.length;i++)
		{
			str[i]=usa.next();
		}
		System.out.println("the names in  string are : ");
		for(int i=0;i<5;i++)
		{
			System.out.println(str[i]);
		}
		
	}
}