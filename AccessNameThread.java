class NameThread extends Thread
{
	public void run()	
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Suraj");
				sleep(1000);
			}
		}
		catch(Exception e)
		{

		}
	}
}
class AccessNameThread
{
	public static void main(String args[])
	{
		NameThread nt=new NameThread();
		nt.start();
	}
}