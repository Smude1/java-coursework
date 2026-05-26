import java.util.*;
class UpperCase extends Exception
{
	UpperCase(String str)
	{
		super(str);
	}
}
class AccessUpperCase 
{
	public static void main(String args[])
	{
		try
		{
			Scanner usa=new Scanner(System.in);
			System.out.println("enter any String ");
			String name=usa.next();
			for(int i=0;i<=name.length();i++)
			{
				char ch=name.charAt(i);
				if(ch>65&&ch<90)
				{
					UpperCase u1=new UpperCase("upper case characters are not allowed");	
					throw u1;
				}
			}
			System.out.println("entered string is : "+name);
		}
		catch(UpperCase e)
		{
			System.out.println(e.getMessage());
		}
	}
}