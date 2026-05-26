class StudentEx
{
	String name;
	int age;
	void get()
	{
		name ="Suraj";		
		age=17;
	}
	void put()
	{
		System.out.println("name is : "+name);	
		System.out.println("age is : "+age);
	}
}
interface marksEx
{
	abstract void getMarks();	
}
class ResultStudentEx extends StudentEx implements marksEx
{
	int total;
	double avg; 
	int tmark1=18,tmark2=19;
	public void getMarks()
	{
		tmark1=18;
		tmark2=19;
	}
	void putResult()
	{
		total=tmark1+tmark2;
		avg=total/2;
		System.out.println("total marks are : "+total);
		System.out.println("average is : "+avg);
	}
}
class AccessResultStudentEx
{
	public static void main(String args[])
	{
		ResultStudentEx r1=new ResultStudentEx();
		r1.get();
		r1.getMarks();
		r1.put();
		r1.putResult();
	}
}