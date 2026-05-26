class abc
{
	int c;
	abc(int c1)
	{
		c=c1;
		System.out.println("im from abc "+c);
	}
}
class ijk extends abc
{
	int b,bb;
	ijk(int b1,int b2)
	{
		super(b2);
		b=b1;
		bb=b2;
		System.out.println("\n\nim from ijk  "+b);
		System.out.println("im from ijk  "+bb);
	}
}
class pqr extends ijk
{
	int a,aa,aaa;
	pqr(int a1,int a2,int a3)
	{
		super(a2,a3);
		a=a1;
		aa=a2;
		aaa=a3;	
		System.out.println("\n\nim from pqr  " + a);
		System.out.println("im from pqr  " + aa);
		System.out.println("im from pqr  " + aaa);
	}
}

class accesspqrsup
{
	public static void main(String args[])
	{
		pqr p1=new pqr(10,20,30);
	}
}