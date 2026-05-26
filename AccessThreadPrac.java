class ThreadPrac extends Thread
{
	String name="Suraj mude from extreme technologies ";
	public void run()
	{
		try
		{
			for(int i=0;i<=name.length();i++)
			{
				char ch=name.charAt(i);
				System.out.print(ch);
				sleep(100);
			}
		}
		catch(Exception e)
		{
		}
	}
}
class AccessThreadPrac
{
	public static void main(String args[])
	{
		ThreadPrac t1=new ThreadPrac();
		t1.start();
	}
}