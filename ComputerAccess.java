import java.util.*;
class Computer
{
	String name;
	double model_no,price;
	int storage;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter model name : ");
		name=usa.next();
		System.out.println("enter model number : ");
		model_no=usa.nextDouble();
		System.out.println("enter storage is GBs : ");
		storage=usa.nextInt();
		System.out.println("enter model price : ");
		price=usa.nextDouble();
		
	}	
	void display()
	{
		System.out.println("\n\tmodel name is : "+name+"\n\tmodel number is : "+model_no+"\n\tstorage in GBs : "+storage+"\n\tmodel price is  : "+price);
	}	
}
class ComputerAccess
{
	public static void main(String args[])
	{
		Computer pc1=new Computer();
		System.out.println();
		pc1.accept();
		System.out.println(".................................");
		pc1.display();
		System.out.println(".................................");
		
	}
}