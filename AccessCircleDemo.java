class CircleDemo
{
	double pi,radius;
	void init()
	{
		pi=3.14;
		radius=4.8;
	}
	void show()
	{
		System.out.println("value of pi is : "+pi);
		System.out.println("radius is : "+radius);
	}
	void calculate()
	{
		double area;
		area=(pi*radius*radius);
		System.out.println("area of circle is : "+area);
	}
}
class AccessCircleDemo
{
	public static void main(String args[])	
	{
		CircleDemo c1=new CircleDemo();
		c1.init();
		c1.show();
		c1.calculate();
	}
}
