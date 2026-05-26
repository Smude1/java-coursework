abstract class PQR
{
	abstract void accept();
}	
class ABC extends PQR
{
	public void accept()
	{
		System.out.println("can i haave your passport and visa ");
	}
	void display()
	{
		System.out.println("are you eligable to travel to usa !! congratulations");
	}
}
class AccessAbstractdemo
{
	public static void main(String args[])
	{
		ABC p1=new ABC();
		p1.accept();
		p1.display();	
	}
	
}	