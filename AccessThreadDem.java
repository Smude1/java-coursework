class ThreadDem extends Thread
{
	int i;
	public void run()
	{
		try
		{
			for(i=1;i<=50;i++)
			{	
				if(i%2==0)
				{
					System.out.print(i+", ");
				}
				if(i%3==0)
				{
					sleep(500);
				}
			}
		}
		catch(Exception e){}
	}
}
class ThreadDem1 extends Thread
{
	 int i;
	public void run()
	{
		System.out.println();
		for(i=50;i>=1;i--)
		{
			if(i%2!=0)
			{
				System.out.print(i+", ");
			}
		}
	}
}
class AccessThreadDem
{
	public static void main(String args[])throws Exception
	{
		ThreadDem t=new ThreadDem();
		ThreadDem1 t1=new ThreadDem1();
		t.start();
		//t1.sleep(1000);
		t1.start();
		
	}
}