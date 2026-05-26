import java.util.*;
class Box
{
	double SurArea,vol,len,wid,hgt;
	void enter()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the length , width, and height of box :");
		len=usa.nextDouble();
		wid=usa.nextDouble();
		hgt=usa.nextDouble();
	}
	void calculate()
	{
		SurArea=2*(len*wid)+2*(len*hgt)+2*(hgt*wid);
		vol=len*wid*hgt;
	}
	void display()
	{
		System.out.println("surface area of box is : "+SurArea);
		System.out.println("volume of box is : "+vol);
	}
}
class BoxAccess
{
	public static void main(String args[])
	{
		Box dabba=new Box();
		dabba.enter();
		dabba.calculate();
		dabba.display();
	}
}