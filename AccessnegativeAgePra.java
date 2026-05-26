import java.util.*;
class negativeAgePra extends Exception
{
	negativeAgePra(String str)
	{
		super(str);
	}
}
class AccessnegativeAgePra
{
	public static void main(String args[])
	{
		try
		{
			Scanner usa=new Scanner(System.in);
			System.out.println("enter your age : ");
			int age=usa.nextInt();
			if(age<0)
			{
				negativeAgePra na=new negativeAgePra("age cannot be negative ");
				throw na;
			}
			else
			{
				System.out.println("your age is  : "+age);
			}
		}
		catch(negativeAgePra e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}