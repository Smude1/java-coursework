interface ABC	//interface is by default abstract 
{	
	int a=5;	//variables are by default final
	void accept();	//methods are also by default abstract  as well
}
interface PQR extends ABC	//used extends to make sub interface of ABC
{	
	int b=5;
	void display();
}
class XYZ implements ABC,PQR 	//used implements to make sub sub of interfaces ABC and PQR
{	
	public void accept()
	{
		//a=a+10; cannot assign value to the final variable
		System.out.println("\n\tIm from ABC : "+a);   //here you can perform operation but cannot assign modified value or change value of final variable
		System.out.println("\tperformed multiplication :  "+(a*a));
	}
	public void display()
	{
		System.out.println("\n\tim from pqr : "+b);
		System.out.println("\tperformed adition  : "+(b+b));
	}
}
class AccessInterface
{
	public static void main(String args[])
	{
		XYZ x1=new XYZ();
		x1.accept();
		x1.display();
	}
}