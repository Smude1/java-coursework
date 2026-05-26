class A extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("even numbers are : ");
			for(int i=1;i<=50;i++)
			{
				if(i%2==0)
				{
					System.out.println(i+", ");
				}
			}
			if(i%3==0)
			{
				sleep();
			}
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("odd numbres are : ");
			if(i%2!=0)
			{
				System.out.print(i+", ");
			}
		}
	}
}
class AccessThreadAB
{
	public static void main(String args[])
	{
		A a1=new A();
		B b1=new B();
		a1.run();
		b1.run();
	}
}