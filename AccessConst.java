class const
{
	int a,b,c;
	const()
	{
		a=12;
		b=12;
		c=a+b;
	}
	void put()
	{
		System.out.println("addition is : "+c);
	}
}
class AccessConst
{
	public static void main(String args[])
	{
		const c1=new const();
		c1.put();
	}
}