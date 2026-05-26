class ABC
{
	 void accept()
	{
		System.out.println("im from ABC ");
	}
}
class PQR extends ABC
{
	void accept()
	{
		System.out.println("i am from PQR ");
	}
}	
class AccessPQR
{
	public static void main(String args[])
	{
		PQR p1=new PQR();
		p1.accept();
	}	
}	