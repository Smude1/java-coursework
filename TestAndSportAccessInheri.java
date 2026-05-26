class student
{
	String name;
	int rollno;	
	void get()
	{
		rollno=111;
		name="Suraj";
	}
	void put()
	{
		 System.out.println("\nname is :"+name+"\nroll number is "+rollno);
	}
}
class test extends student
{
	int test1,test2;
	void accept()
	{
		test1=18;
		test2=19;
	}		
	void display()
	{
		System.out.println("1st test marks are : "+test1+"\n 2nd test maarks are :  "+test2);
	}
}
class sport extends student
{
	int sportm;
	void marks()
	{
		sportm=19;
	}
	void marksobt()
	{
		System.out.println("sports marks are : "+sportm);
	}
}
class TestAndSportAccessInheri
{
	public static void main(String args[])
	{
		test t1=new test();
		sport s1=new sport();
		
		t1.get();
		t1.accept();
		t1.put();
		t1.display();
		
		s1.get();
		s1.marks();
		s1.put();
		s1.marksobt();
	}
}