import java.util.*;
class StringDemo5
{
	public static void main(String args[])
	{
		String str;
		int i,countvow=0;
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the characters in the String : ");
		str=usa.next();
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
			{
				countvow++;
			}
		}
		System.out.println("\nthe number of vowels in the string are : "+countvow);
	}
}