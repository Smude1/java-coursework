class thisDemo
{
	int rollno;
	String name;
	double per;
	thisDemo(int rollno , String name,double per)
	{
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}
	void display()
	{
		System.out.println("rollno is  : "+rollno+"\nname is :"+name+"\npercentage is: "+per);

	}
}
class thisDemoAccess
{
	public static void main(String args[])
	{
		thisDemo t1=new thisDemo(101,"mahesh",84.23);	
		t1.display();
	}
}