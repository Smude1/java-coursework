class Thread1 extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=20;i++)
		{
			System.out.print(" , from thread 1 : "+i);
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+", ");
			}
		}
	}
}
class Threadaccess
{
	public static void main(String args[])throws Exception
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t1.sleep(1000);
		System.out.println("\n\n");
		t2.start();
		
	}
}