final class ABC
{
	int i=12;
	 void show()
	{
		System.out.println("i'm from ABC "+i);
	}
}
class PQR
{
	void show()
	{
		System.out.println("i am from PQR ");
	}
}	
class finalClassDemo
{
	public static void main(String args[])
	{
		ABC a1=new ABC();
		PQR p1=new PQR();
		a1.show();
		p1.show();
	}	
}	