//multilevel Inheritance

import java.io.*;
class customer 
{	
	String name;
	int phoneno;
	void add() throws Exception
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);
		System.out.println("enter customer name : ");
		name=usa.readLine();
		System.out.println("enter customer phone number : ");
		phoneno=Integer.parseInt(usa.readLine());
	}
	void show()
	{
		System.out.println("customer name is : "+name);
		System.out.println(" customer phone number is : "+phoneno);
	}
	
}
class depositor extends customer
{
	int accno,bal;
	void get() throws Exception
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);

		System.out.println("enter depositor's account number : ");
		accno=Integer.parseInt(usa.readLine());
		System.out.println("enter depositor's balance : ");
		bal=Integer.parseInt(usa.readLine());
	}
	void put()
	{
		System.out.println("depositor's account number is : "+accno);
		System.out.println(" depositor's balance is : "+bal);
	}
}
class borrower extends depositor
{
	int loannum,loanamt;
	void accept() throws Exception
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);

		System.out.println("enter borowers loan number : ");
		loannum=Integer.parseInt(usa.readLine());
		System.out.println("enter borowers loan amount : ");
		loanamt=Integer.parseInt(usa.readLine());
	}
	void display()
	{
		System.out.println("borowers loan number is  : "+loannum);
		System.out.println("borowers loan amount is  : "+loanamt);
	}
}
class borrowerAccessInheri
{
	public static void main(String args[]) throws Exception
	{
		borrower b1=new borrower();
		b1.add();
		b1.get();
		b1.accept();
		
		System.out.println("\n........................................................");
		b1.show();
		System.out.println("\n........................................................");
		b1.put();
		System.out.println("\n........................................................");
		b1.display();
		System.out.println("........................................................");
	}
}