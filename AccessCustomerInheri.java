import java.util.*;
interface account
{	
	abstract void set();
	abstract void display();
}
interface person
{
	abstract void store();
	abstract void disp();
}
class customer implements account,person
{
	
	int accno,balance;
	double roi=9.8;
	double intrest;
	String name;
	Scanner usa=new Scanner(System.in);
	public void set()
	{
		System.out.println("enter your accont no and balance : ");
		accno=usa.nextInt();
		balance=usa.nextInt();
	}
	public void display()
	{
		intrest=(balance*roi)/100;
		System.out.println(" your accont no : " +accno);
		System.out.println(" your balance  : "+balance);
		System.out.println(" rate of intrest is  : "+roi);
		System.out.println("intrest is : "+intrest);
	}
	public void store()
	{
		System.out.println("enter your name : ");
		name=usa.next();
	}
	public void disp()
	{
		System.out.println("name is : "+name);
	}
}
class AccessCustomerInheri
{
	public static void main(String args[])	
	{
		customer c1=new customer();
		c1.set();
		c1.store();
		c1.disp();
		c1.display();
	}
}
