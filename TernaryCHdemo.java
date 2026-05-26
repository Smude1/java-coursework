import java.util.*;
class TernaryCHdemo
{
	public static void main(String args[])
	{
		char ch;
		Scanner uk=new Scanner(System.in);
		System.out.println("\n\n\tenter any character : ");
		String str1=uk.next();
		ch=str1.charAt(0);
		
		String str2=(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u')?"its a 				vowel ":"its a consonent ";
		System.out.println(str1);
	}
}