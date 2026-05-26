class Rectangle
{
	double len,bre,area,peri;
	void accept(double l,double b)
	{
		len=l;
		bre=b;
	}
	void calArea()
	{
		area=len*bre;
		System.out.println("the area of rectangle is : "+area);
	}
	void calperimeter()
	{
		
		peri=2*(len+bre);
		System.out.println("\nperimeter of rectangle is : "+peri);
	}
	
}
class RectangleAccess
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		r1.accept(5.8,3.2);
		r1.calArea();
		r1.calperimeter();
	}
}