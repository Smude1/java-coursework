class Thread1 implements Runnable
{
	int i;
	public void run()
	{
		System.out.println("numbers is in ascending order : ");
		for(i=1;i<=50;i++)
		{
			System.out.print(i+", ");	
		}
	}
}
class Thread2 implements Runnable
{
	int i;
	public void run()
	{
		System.out.println("\n\nnumbers is descending order :");
		for(i=50;i>=1;i--)
		{
			System.out.print(i+", ");
		}
	}
}
class AccessRunnablePgm
{
	public static void main(String args[])throws Exception
	{
		Thread1 t1=new Thread1();
		Thread td1 =new Thread(t1);
		Thread2 t2=new Thread2();
		Thread td2 =new Thread(t2);
		td1.start();
		td1.sleep(1000);
		td2.start();
	}
}