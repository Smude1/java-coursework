class conDemo
{
	int age;
	String name;
	conDemo()
	{
		age=17;
		name="suraj";
	}
	conDemo(String nm,int ag)
	{
		name=nm;
		age=ag;
	}
	conDemo(conDemo usa)
	{
		name=usa.name;
		age=usa.age;	
	}
	void put()
	{
		System.out.println("your age is : "+age);
		System.out.println("your name is : "+name);
	}
}
class AccessConDemo
{
	public static void main(String args[])
	{
		conDemo c1=new conDemo();
		conDemo c2=new conDemo("dnyanesh",17);
		conDemo c3=new conDemo(c2);
		c1.put();
		c2.put();
		c3.put();
	}
}