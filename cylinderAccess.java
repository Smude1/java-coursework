import java.util.*;
class cylinder
{
	double SurArea,vol,radius,hgt;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the radius and height of cylinder :");
		radius=usa.nextDouble();
		hgt=usa.nextDouble();
	}
	void calculate()
	{
		SurArea=2*(3.14*radius*hgt)+2*(3.14*radius*radius);
		vol=3.14*radius*radius*hgt;
	}
	void display()
	{
		System.out.println("surface area of cylinder is : "+SurArea);
		System.out.println("volume of cylinder is : "+vol);
	}
}
class cylinderAccess
{
	public static void main(String args[])
	{
		cylinder sp1=new cylinder();
		sp1.accept();
		sp1.calculate();
		sp1.display();
	}
}