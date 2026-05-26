class Thread1 extends Thread
{
	public void run()
	{
		int i;
		System.out.println("the ascending order numbers are : ");
		for(i=1;i<=50;i++)
		{
			System.out.print(i+" ,");
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		int i;
		System.out.println("\nthe descending order numbers are : ");
		for(i=50;i>=1;i--)
		{
			System.out.print(i+" ,");
		}
	}
}
class Thread1_and_2Accessed
{
	public static void main(String args[])throws Exception
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		System.out.println(".................................................................................");
		t1.start();
		t1.sleep(2000);
		System.out.println("\n.................................................................................");
		t2.start();
	}
}