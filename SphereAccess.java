import java.util.*;
class Sphere
{
	double SurArea,vol,radius;
	void enter()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the radius of Sphere :");
		radius=usa.nextDouble();
	}
	void calculate()
	{
		SurArea=4*3.14*(radius*radius);
		vol=4/3*(radius*radius*radius);
	}
	void display()
	{
		System.out.println("surface area of sphere is : "+SurArea);
		System.out.println("volume of sphere is : "+vol);
	}
}
class SphereAccess
{
	public static void main(String args[])
	{
		Sphere sp1=new Sphere();
		sp1.enter();
		sp1.calculate();
		sp1.display();
	}
}