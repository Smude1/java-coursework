import java.util.*;
class rectangle
{
	double length,breadth;
	Scanner usa=new Scanner(System.in);
	void accept()
	{
		System.out.println("enter the length : ");
		length=usa.nextDouble();
		System.out.println("enter the breadth : ");
		breadth=usa.nextDouble();
	}
}
class Arearect extends rectangle
{
	int area;
	void calculate()
	{
		System.out.println("the area of rectangle is : "+(length*breadth));
	}
}
class ArearectAccess
{
	public static void main(String args[])	
	{
		Arearect a1= new Arearect();
		a1.accept();
		System.out.println("\n.....................................................");
		a1.calculate();
		System.out.println(".....................................................");
	}
}