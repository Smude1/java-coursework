import java.util.*;
class StringDemo3
{
	public static void main(String args[])
	{
		String str;
		int i,countalpha=0,countnum=0;
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the characters in the String : ");
		str=usa.next();
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
			{
				countalpha++;
			}
			if(ch>=48 && ch<=57)
			{
				countnum++;
			}
		}
		
		System.out.println("\nthe number of alphabetical character in the string are : "+countalpha);
		System.out.println("\nthe number of numerical character in the string are : "+countnum);
	}
}