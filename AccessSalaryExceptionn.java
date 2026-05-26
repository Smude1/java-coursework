import java.util.*;
class SalaryExceptionn extends Exception
{
	SalaryExceptionn(String str)
	{
		super(str);
	}
}
class AccessSalaryExceptionn
{
	public static void main(String args[])
	{
		try
		{
			Scanner usa=new Scanner(System.in);
			System.out.println("enter your salary");
			int sal=usa.nextInt();
			if(sal<0)
			{
				SalaryExceptionn na=new SalaryExceptionn("enter valid salary");
				throw na;
			}
			else
			{
				System.out.println("salary  is : "+sal);
			}
		}
		catch(SalaryExceptionn e)	
		{
			System.out.println(e.getMessage());
		}
	}
}