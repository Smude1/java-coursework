import java.util.*;
class Student
{
	String name,branch;
	int rollno;
	double percentage;
	Scanner usa;
	void get()
	{
		usa=new Scanner(System.in);
		System.out.println("enter your roll number,name,branch and percentage");
		rollno=usa.nextInt();
		name=usa.next();
		branch=usa.next();
		percentage=usa.nextDouble();
	}
	void put()	
	{
		System.out.println("rollno"+"\t"+"name"+"\t"+ "branch"+"\t"+"percentage ");
		System.out.println(rollno+"\t"+name+"\t"+branch+"\t"+percentage);
	}
}
class AccesssStudenttt
{
	public static void main(String args[])
	{
		Student s1[]=new Student[10];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=new Student();
			s1[i].get();
		}
		for(int i=0;i<s1.length;i++)
		{
			s1[i].put();
		}
		System.out.println("\nstudents above percentage 90 : ");
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i].percentage>90)
			{
				s1[i].put();
			}
		}
		
	}
}