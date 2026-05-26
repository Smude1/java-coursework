import java.util.*;
class StringDemo1
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
			if(ch>=48 && ch<=57)
			{
				count++;
			}
		}
		System.out.println("\nthe number of numeric character in the string are : "+count);
	}
}