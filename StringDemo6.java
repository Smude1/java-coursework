import java.util.*;
class StringDemo6
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
			if(ch=='a' || ch=='A')
			{
				count++;
			}
		}
		System.out.println("\nthe occurance os character a/A  in the string are : "+count);
	}
}