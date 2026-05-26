import java.util.*;
class Ternarydemo2
{
	public static void main(String args[])
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("\n\tenter any character : ");
		String str1=usa.next();
		char ch=str1.charAt(0);

		String str2=(ch=='a'||ch=='e'|| ch=='i' || ch=='o' || ch=='u')?"its a vowel":"its a 		consonent ";
		System.out.println(str2);
	}
}