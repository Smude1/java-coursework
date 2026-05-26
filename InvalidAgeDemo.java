import java.util.*;
class InvalidAge extends Exception
{
	InvalidAge(String str)
	{
		super(str);
	}
}
class InvalidAgeDemo
{
	public static void main(String args[])
	{
		try
		{	
			Scanner usa=new Scanner(System.in);
			System.out.println("enter your age : ");
			int age=usa.nextInt();
			if(age<18)
			{
				InvalidAge e1=new InvalidAge("oh boy !!!.....you're underage guy......please come when you'll become adult LOL!!");
				throw e1;
			}
			else 
			{
				System.out.println("you're eligible to enter.......your age is : "+age);
			}
			
		}
		catch(InvalidAge e)	
		{
			System.out.println(e.getMessage());
		}
	}
}