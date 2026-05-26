class practice
{
	int modelno;
	String name;
	double price;
	practice(int mno,String nm,double prc)
	{
		modelno=mno;
		name=nm;
		price=prc;
	}
	practice(practice usa)
	{
		name=usa.name;
		price=usa.price;
		modelno=usa.modelno;
	}
	void show()
	{
		System.out.println("model no is : "+modelno+"\nname is : "+name+"\nprice is : "+price);
		
	}
}
class Accesspractice
{
	public static void main(String args[])
	{
		practice p1=new practice(12334,"dell",40000);
		practice p2=new practice(p1);
		p1.show();
		System.out.println("----------------------------------");
		p2.show();
	}
}