class ThreadCreation extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("im from creation : "+i);
		}
	}
	
	
}
class ThreadHome extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			System.out.println("from home : "+i);
		}
	}
}
class AccessThreadCreation
{
	public static void main(String args[])throws Exception
	{
		ThreadCreation t1=new ThreadCreation();
		ThreadHome t2= new ThreadHome();
		t1.setName("Suraj");
		t2.setName("Mude");
		System.out.println("current is  : "+t1.getName());
		System.out.println("current is  : "+t2.getName());
		t1.sleep(2000);
		t1.start();
		t2.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("im from main : "+i);
		}
	
	}
}