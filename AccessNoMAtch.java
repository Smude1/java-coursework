import java.util.*;
class NoMAtch extends Exception
{
	NoMAtch(String str)
	{
		super(str);
	}
}
class AccessNoMAtch
{
	public static void main(String args[])
	{
	try
	{
		String n="MSBTE";
		Scanner usa=new Scanner(System.in);
		System.out.println("enter msbte");
		String str=usa.next();
		if(n.equalsIgnoreCase(str))
		{
			System.out.println("correct ");
		}
		else
		{
			NoMAtch n1=new NoMAtch("not matched ");
			throw n1;
		}
	}
	catch(NoMAtch e)
	{
		System.out.println(e.getMessage());
	}
	}
}