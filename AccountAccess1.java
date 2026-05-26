import java.util.*;
class Account1
{
	int acc_no,amt;
	String name;
	double balance;
	Scanner usa=new Scanner(System.in);	
	void accept()
	{
		System.out.println("enter account number,name and balance ");	
		acc_no=usa.nextInt();
		name=usa.next();
		balance=usa.nextDouble();
	}
	void deposit()
	{
		System.out.println("enter amount to deposit : ");
		int depamt=usa.nextInt();
		balance=balance+depamt;
	}
	void withdraw()
	{
		System.out.println("enter amount to withdraw : ");
		int wthamt=usa.nextInt();
		if(balance>wthamt)
		{
			balance=balance-wthamt;
		}
		else
		{
			System.out.println("insufficient balance ");
		}
	}
	void display()
	{
		System.out.println("account number is :"+acc_no);
		System.out.println("name is : "+name);
		System.out.println("balance is : "+balance);
	}
	
}
class AccountAccess1
{
	public static void  main(String args[])
	{
		Account1 ac1=new Account1();
		Scanner uk=new Scanner(System.in);
		int choice,cnt;
		ac1.accept();
		do
		{
			System.out.println("enter 1 to deposit  amt : ");
			System.out.println("enter 2 to withdraw  amt : ");
			System.out.println("enter 3 to display  amt : ");
		
			System.out.println("enter your choice : ");
			choice=uk.nextInt();
			switch(choice)
			{
				case 1 : 
					ac1.deposit();
					break;
				case 2 : 
					ac1.withdraw();
					break;
				case 3 :
					ac1.display();
					break;
				default : 
					System.out.println("entered choice is wrong ");
			}
			System.out.println("do u want to continue , press 1 ");
			cnt=uk.nextInt();
		}
		while(cnt==1);
	}
}