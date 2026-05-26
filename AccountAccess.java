import java.util.*;
class Account
{
	double acc_no,balance;
	String name;
	void inputdata()
	{
		Scanner ind=new Scanner(System.in);
		System.out.println("enter account no : ");
		acc_no=ind.nextDouble();
		System.out.println("enter name : ");
		name=ind.next();
		System.out.println("enter balance : ");
		balance=ind.nextDouble();
	}
	void showdata()
	{
		System.out.println("\n\taccount number is : "+acc_no+"\n\t"+"name is : "+name+"\n\t"+"balance is : "+balance);
	}
	
}
class AccountAccess
{
	public static void main(String args[])
	{
		Account ac1=new Account();
		Account ac2=new Account();
		
		ac1.inputdata();
		System.out.println();
		ac2.inputdata();
		System.out.println("............................");
		ac1.showdata();
		System.out.println("..............................");
		ac2.showdata();

	}
}