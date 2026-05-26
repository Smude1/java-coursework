import java.util.*;
class ThreadString extends Thread
{
	Scanner usa=new Scanner(System.in);
	String name;
	public void run()
	{
		try
		{
			System.out.println("enter your name : ");	
			name=usa.next();
			for(int i=0;i<name.length();i++)
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
class AccessThreadString
{
	public static void main(String args[])
	{
		ThreadString t1=new ThreadString();
		t1.start();
	}
}