class Thread1st extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=50;i++)
			{
				System.out.print(i+", ");
				sleep(100);
			}
		}
		catch(Exception e)
		{

		}
	}
}
class AccessThread1st
{
	public static void main(String args[])
	{
		Thread1st t1=new Thread1st();
		t1.start();
	}
}