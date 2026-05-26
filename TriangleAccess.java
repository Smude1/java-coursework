import java.util.*;
class Triangle
{
	double area,base,hgt;
	void getdata()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the  base and height of triangle : ");
		base=uk.nextDouble();
		hgt=uk.nextDouble();
	}
	void calculate()
	{
		area=0.5*(base*hgt);
	}
	void display()
	{
		System.out.println("area of triangle is : "+area);
	}	
	
}
class TriangleAccess
{
	public static void main(String args[])
	{
		Triangle t1=new Triangle();
		t1.getdata();
		t1.calculate();
		t1.display();
	}
}