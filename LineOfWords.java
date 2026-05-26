import java.util.*;
class LineOfWords
{
	public static void main(String args[])
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the line of words : ");
		String str=usa.next();
		for(int i=0;i<=str.length()-1;i++)
		{	
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}
}