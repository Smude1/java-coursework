import java.util.*;
class Stringpallindrome
{
	public static void main(String args[])
	{
		
		Scanner usa=new Scanner(System.in);
		System.out.println("Enter string : ");
		String name=usa.next();
		int n=name.length()-1;
		int i=0;
		int flag=0;
		while(i<name.length())
		{
			char ch1=name.charAt(i);
			char ch2=name.charAt(n);
			if(ch1 !=ch2)
			{
				flag=1;
				break;
			}
			i++;	
			n--;
		}
		if(flag==1)
		{
			System.out.println("not pallindrome !");
		}
		else
		{
			System.out.println("pallindrome");
		}
	}
}