import java.util.*;
import java.io.*;
class BufferedReaderDemo4
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);
		System.out.println("enter any character ");
		String str=usa.readLine();
		char ch=str.charAt(0);
		if(ch>=65 && ch<=90 )
		{
			System.out.println("its an uppercase character !!");
		}
		else
		{
			if(ch>=97 && ch<=122)
			{
				System.out.println("its a lowercase character");
			}
		}
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || 
		ch=='O' || ch=='u' || ch=='U')
		{
			System.out.println("and its a vowel !!!!");
		}
		else 
		{
			System.out.println("and its a consonant !!!!");
		}
	}
}