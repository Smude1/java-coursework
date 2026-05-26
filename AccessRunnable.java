class Thread1 implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<=20;i++)
		{
			System.out.println("im from Thread1 : "+i);
		}
	}
}
class AccessRunnable
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread td=new Thread(t1);
		td.start();
		for(int i=1;i<20;i++)
		{
			System.out.println("from main : "+i);
		}
	}
}