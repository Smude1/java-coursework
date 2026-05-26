import java.io.*;
class LengthChar extends Exception
{
	LengthChar(String str)	
	{
		super(str);
	}
}
class PassCorrect extends Exception
{
	PassCorrect(String pas)
	{
		super(pas);
	}
}
class LengthCharDemo
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader usa=new BufferedReader(isr);
			
			System.out.println("enter username");
			String usnm=usa.readLine();
			String pass ="Suraj12345";
			System.out.println("enter your password : ");
			String password=usa.readLine();
		
			if(usnm.length()<6)
			{
				LengthChar l1=new LengthChar("username character should be above 6");
				throw l1;
			}
			else
			{
				System.out.println("user name is correct!!!");
			}
			if(password.equals(pass))
			{
				System.out.println("password entered correctly ");
			}
			else
			{
				PassCorrect m1=new PassCorrect("password is incorrect ............enter correct password  ");
				throw m1;
			}
	
		}
		catch(PassCorrect e)	
		{
			System.out.println(e.getMessage());
		}
		catch(LengthChar e)
		{
			System.out.println(e.getMessage());
		}
	}
}