import java.util.*;
class Cone
{
	double SurArea,vol,radius,hgt;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the radius and height of cone :");
		radius=usa.nextDouble();
		hgt=usa.nextDouble();
	}
	void calculate()
	{
		SurArea=(3.14*radius*radius)+Math.sqrt((hgt*hgt)+(radius*radius));
		vol=(3.14*radius*radius)*(hgt/3);
	}
	void display()
	{
		System.out.println("surface area of cone is : "+SurArea);
		System.out.println("volume of cone is : "+vol);
	}
}
class coneAccess
{
	public static void main(String args[])
	{
		Cone sp1=new Cone();
		sp1.accept();
		sp1.calculate();
		sp1.display();
	}
}