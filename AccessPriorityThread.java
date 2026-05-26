class ThPrDemo1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("from thread 1 : "+i);
		}
	}
}
class ThPrDemo2 extends Thread
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			System.out.println("from thread 2 : "+i);
		}
	}
}
class ThPrDemo3 extends Thread
{
	public void run()
	{
		for(int i=21;i<=30;i++)
		{
			System.out.println("from thread 3 : "+i);
		}
	}
}
class AccessPriorityThread
{
	public static void main(String args[])
	{
		
		ThPrDemo1 t1=new ThPrDemo1();		
		ThPrDemo2 t2=new ThPrDemo2();		
		ThPrDemo3 t3=new ThPrDemo3();	

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("priority is  : "+t1.getPriority());
		System.out.println("priority is  : "+t2.getPriority());
		System.out.println("priority is  : "+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();	
	}
}