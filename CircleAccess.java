import java.util.*;
class Circle
{
	double area,circum,radius;
	 void get()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		radius=usa.nextDouble();
	}
	void calculate()
	{
		area=3.14*(radius*radius);
		circum=2*(3.14*radius);
	}
	void Display()
	{
		System.out.println("\nthe area of circle is : "+area);
		System.out.println("\nthe circumference of circle is : "+circum);
		
	}
}
class CircleAccess
{
	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.get();
		c1.calculate();
		c1.Display();
	}
}
