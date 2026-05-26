class studentinh
{
	int rollno;
	String name;
	void get()
	{
		rollno=12345;
		name="suraj" ;
	}
	void put()
	{
		System.out.println("rollno is : "+rollno);
		System.out.println("name is : "+name);
	}
}
class testinh extends studentinh
{
	int testmark1,testmark2;
	void getmark()
	{
		testmark1=18;
		testmark2=20;
	}
	void putmarks()
	{
		System.out.println("marks of test 1 : "+testmark1);
		System.out.println("marks of test 2 : "+testmark2);
	}
}
class  testinhAccess
{
	public static void main(String args[])
	{
		testinh t1= new  testinh();
		t1.get();
		t1.getmark();
		t1.put();
		t1.putmarks();
	}
}