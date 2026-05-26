class ThreadPra extends Thread
{
	int i;
	public void run()
	{
		try
		{
			System.out.println("even numbers from 1 to 50");
			for(i=1;i<=50;i++)
			{
				if(i%2==0)
				{
					System.out.print(i+", ");
				}
			}
		}
		catch(Exception e)
		{
		}
	}
}
class ThreadPra1 extends Thread
{
	int i;
	public void run()
	{
		try
		{
			System.out.println("odd numbers from 1 to 50");
			for(i=1;i<=50;i++)
			{
				if(i%2!=0)
				{
					System.out.print(i+", ");
					sleep(400);
				}
			}
		}
		catch(Exception e)
		{
		}
	}
}
class AccessThreadPra
{
	public static void main(String args[])throws Exception
	{
		ThreadPra t1=new ThreadPra();
		t1.start();
		ThreadPra1 t2=new ThreadPra1();
		t2.sleep(100);
		t2.start();
	}
}