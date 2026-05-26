import java.io.*;
class NoMatch extends Exception
{
	NoMatch(String str)	
	{
		super(str);
	}
}
class NoMatchDemo
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader usa=new BufferedReader(isr);
			System.out.println("enter MSBTE : ");
			String name=usa.readLine();
			if(name.equals("MSBTE"))
			{
				System.out.println("you entered correctly : "+name);
			}
			else
			{
				NoMatch m1=new NoMatch("name hasn't matched ...try again ");
				throw m1;
			}
	
		}	
		catch(NoMatch e)
		{
			System.out.println(e.getMessage());
		}
	}
}