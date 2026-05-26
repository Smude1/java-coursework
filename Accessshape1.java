//method overloading program in which this keyword is used.

class shape1
{
	int side;
	double len,bre,rad;
	void area(int side)
	{	
		this.side=side;
		System.out.println("the area of square :  "+(this.side*this.side));
	}
	void area(double len, double bre)
	{
		this.len=len;
		this.bre=bre;
		System.out.println("the area of rectangle is : "+(this.len*this.bre));
	}
	void area(double rad)
	{
		this.rad=rad;
		System.out.println("the area of circle is : "+(3.14*this.rad*this.rad));
	}
}
class Accessshape1
{
	public static void main(String args[])
	{
		shape1 s1=new shape1();
		s1.area(4);
		s1.area(2.2,4.4);
		s1.area(6.2);
	}
}