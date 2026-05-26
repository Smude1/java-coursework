class Stu
{
	int rollno;
	String name;
	Double per;	
	Stu(int rno , String nm , double pr)
	{
		rollno=rno;
		name=nm;
		per=pr;
	}
	Stu()
	{
		rollno=2222;
		name="Amol";
		per=84.21;
	}
	Stu(Stu uk)	
	{
		rollno=uk.rollno;
		name=uk.name;
		per=uk.per;	
	}
	void display()
	{
		System.out.println("\troll no.  is : "+rollno);
		System.out.println("\tname  is : "+name);
		System.out.println("\tpercentage is : "+per);
	}
}
class StuAccess
{
	public static void  main(String args[])
	{
		Stu s1=new Stu(121, "Suraj" , 85.45);
		Stu s2=new Stu();
		Stu s3=new Stu(s1);
		System.out.println("\t...................................");
		s1.display();
		System.out.println("\t...................................");
		s2.display();
		System.out.println("\t...................................");
		s3.display();
	}		
}