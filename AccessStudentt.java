import java.util.*;
class Studentt
{
	int rollno;
	String name;
	String branch;
	double per;
	void accept()
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter roll number : ");
		rollno=usa.nextInt();
		System.out.println("enter name : ");		
		name=usa.next();
		System.out.println("enter branch : ");
		branch=usa.next();
		System.out.println("enter percentage  : ");
		per=usa.nextDouble();
	}
	void display()
	{
		System.out.println("\n\troll number is "+rollno+"\n"+"\tname is : "+name+"\n"+"\tbranch is : "+branch+"\n"+"\tpercentage is : "+per);
	}
}
class AccessStudentt
{
	public static void main(String args[])
	{
		Studentt s1=new Studentt();
		Studentt s2=new Studentt();
		s1.accept();
		s2.accept();
		s1.display();
		System.out.println();
		s2.display();
		
	}
}