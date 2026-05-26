//simple method overloading program 

class shape
{
	void area(int side)
	{
		System.out.println("the area of square :  "+(side*side));
	}
	void area(double len, double bre)
	{
		System.out.println("the area of rectangle is : "+(len*bre));
	}
	void area(double rad)
	{
		System.out.println("the area of circle is : "+(3.14*rad*rad));
	}
}
class Accessshape
{
	public static void main(String args[])
	{
		shape s1=new shape();
		s1.area(4);
		s1.area(2.2,4.4);
		s1.area(6.2);
	}
}