class Abc
{
	int a;
	Abc(int a1)
	{
		a=a1;
		System.out.println("a is : "+a);
	}
}
class def extends Abc
{
	def(int b,int c)
	{
		super(c);
		System.out.println("b is : "+b);
	}
}
class ghi extends def
{
	ghi(int d,int e,int f)		
	{
		super(e,f);
		System.out.println(" d is "+d+"\ne is : "+d);
	}
}
class Accessghi
{
	public static void main(String args[])
	{
		ghi g1=new ghi(11,22,33);
	}
}