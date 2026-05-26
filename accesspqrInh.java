class abc
{
	final void get2()
	{
		System.out.println("im from abc ");
	}
}
class ijk extends abc
{
	final void get1()
	{
		super.get2();
		System.out.println("im from ijk");
	}
}
class pqr extends ijk
{
	void get()
	{
		super.get1();
		System.out.println("im from pqr");
	}
}

class accesspqrInh
{
	public static void main(String args[])
	{
		pqr p1=new pqr();
		p1.get();
	}
}