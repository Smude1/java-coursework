import java.util.*;
class StringDemo2
{
	public static void main(String args[])
	{
		String str;
		int i,count=0;
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the characters in the String : ");
		str=usa.next();
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
			{
				count++;
			}
		}
		System.out.println("\nthe number of alphabetical character in the string are : "+count);
	}
}