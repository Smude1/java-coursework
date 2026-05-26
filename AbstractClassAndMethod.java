abstract class ABC	
{
	abstract void display();	//abstract method should be inside abstract class.it cannot have code body,it is a method without body.shoyld be end with semocolon.
}
class PQR extends ABC	//subclass is compoulsary for the abstract class
{
	public void display()		//works is to give code body to the abstract method 
	{
		System.out.println("hello , you're an amazing person");
	}
	void show()
	{
		System.out.println("you're master in Java !!!!");
	}
}
class AbstractClassAndMethod
{
	public static void main(String args[])
	{
		PQR p1=new PQR();		//abstract class cannot be instantiated ,hence create object of subclass
		p1.display();
		p1.show();
	}
}