import java.io.*;
class AuthenticationFailure extends Exception
{
	AuthenticationFailure(String str)	
	{
		super(str);
	}
}
class AuthenticationFailureDemo
{
	public static void main(String args[]) throws Exception
	{
		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader usa=new BufferedReader(isr);
			String pass ="Suraj12345";
			System.out.println("enter your password : ");
			String password=usa.readLine();
			if(password.equals(pass))
			{
				System.out.println("password entered correctly ");
			}
			else
			{
				AuthenticationFailure m1=new AuthenticationFailure("password is incorrect ............enter correct password  ");
				throw m1;
			}
	
		}	
		catch(AuthenticationFailure e)
		{
			System.out.println(e.getMessage());
		}
	}
}