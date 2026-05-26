class ABC
{
	int aa=12;
	final void accept()
	{
		int a=aa;
		System.out.println("im from ABC "+a);
	}
}
class PQR extends ABC
{
	void accept1()
	{
		super.accept();
		System.out.println("i am from PQR ");
		System.out.println("hii : "+(super.aa));
	}
}	
class DynamicDispatchDemo
{
	public static void main(String args[])
	{
		ABC a1=new ABC();
		PQR p1=new PQR();
		ABC A1;
		A1=a1;
		A1.accept();
		A1=p1;
		A1.accept();
		
	}	
}	