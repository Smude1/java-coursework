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
class FinalMethodDemo
{
	public static void main(String args[])
	{
		PQR p1=new PQR();
		p1.accept1();
	}	
}	