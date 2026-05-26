class ExceptionHandelingdemo
{
	public static void main(String args[])
	{
		try
		{
			int a=10,b=5,c=5,d;
			System.out.println("hello");
			d=10/(b+c);
			System.out.println("RESULT IS : "+d);
			System.out.println("miss you !");
		}
		catch(Exception e)
		{
			System.out.println("from catch");
		}
		finally
		{
			System.out.println("im from finally block");
		}
	}
}