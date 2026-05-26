import java.util.*;
class Person
{
	String name;
	int age;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter person's name : ");
		name=usa.next();
		System.out.println("enter person's age : ");
		age=usa.nextInt();
		
	}
	void show()
	{
		System.out.println("\tname is : "+name+"\n\t"+"age is : "+age);
	}
}
class PersonAccess
{
	public static void main(String args[])
	{
		Person aadmi1=new Person();
		Person aadmi2=new Person();
		Person aadmi3=new Person();
		aadmi1.accept();
		aadmi2.accept();
		aadmi3.accept();
		
		aadmi1.show();
		System.out.println("........................");
		aadmi2.show();
		System.out.println("........................");
		aadmi3.show();
			
	}
}