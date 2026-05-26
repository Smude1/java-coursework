import java.util.*;
class StringDemo7
{
	public static void main(String args[])
	{
		String str,strrev="";
		int i,count=0;
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the characters in the String : ");
		str=usa.next();
		for(i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			strrev=strrev+ch;
		}
		System.out.println("\nreverse of string are : "+strrev);
	}
}