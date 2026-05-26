import java.util.*;
class MyException extends Exception
{
	MyException(String str)
	{
		super(str);
	}
}
class MyExceptionDemo
{
	public static void main(String args[])
	{
		try
		{	
			Scanner usa=new Scanner(System.in);
			System.out.println("enter your name : ");
			String name=usa.next();
			System.out.println("enter your age : ");
			int age=usa.nextInt();
			if(age<0)
			{
				MyException e1=new MyException("please enter valid age !");
				throw e1;
			}
			else 
			{
				System.out.println("age is : "+age);
			}
			
		}
		catch(MyException e)	
		{
			System.out.println(e.getMessage());
		}
	}
}