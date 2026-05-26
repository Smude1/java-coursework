import java.util.*;
class Studentt1
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
class AccessStudentt1
{
	public static void main(String args[])
	{
		int i;
		Studentt1 s1[]=new Studentt1[5];
		for(i=0;i<5;i++)
		{
			s1[i]=new Studentt1();
			s1[i].accept();
		}
		for(i=0;i<5;i++)
		{
			s1[i].display();
		}
		
	}
}