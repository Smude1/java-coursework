import java.util.*;
class SalaryException extends Exception
{
	SalaryException(String str)
	{
		super(str);
	}
}
class SalaryExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			Scanner usa=new Scanner(System.in);
			System.out.println("enter name of employee : ");
			String ename=usa.next();
			System.out.println("enter employee salary : ");
			double esal=usa.nextDouble();
			if(esal<0)
			{
				SalaryException s1=new SalaryException("salary can't be negative .......please enter valid salary !!");
				throw s1;
			}
			else 
			{
				System.out.println("\n\t\temployee's information is : ");
				System.out.println("\t\temployee name is : "+ename);
				System.out.println("\t\temployee salary is : "+esal);
			}
		}
		catch(SalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}
}