import java.util.*;
class NoMatchEX extends Exception
{
	NoMatchEX(String str)
	{
		super(str);
	}
}
class AccessNoMatchEX
{
	public static void main(String args[])
	{
		try
		{
			Scanner usa=new Scanner(System.in);	
			System.out.println("enter first string ");
			String str1=usa.next();
			System.out.println("enter second string ");
			String str2=usa.next();
			if(str1.equalsIgnoreCase(str2))
			{
				System.out.println("you entered correctly , strings are : "+str1+"-"+str2);
			}
			else
			{
				NoMatchEX nm=new NoMatchEX("not matched ,please try again");
				throw nm;
			}
		}
		catch(NoMatchEX e)
		{
			System.out.println(e.getMessage());	
		}
	}
}
