class A
{
	final void show()
	{
		System.out.println("in show of A");
	}
}
class B extends A
{
	void show1() // can not override because it is declared with final
	{
		super.show();
		System.out.println("in show of ");
	}
}
class bAccess
{
	public static void main(String args[])
	{
		B b=new B();
		b.show1();
	}
}
