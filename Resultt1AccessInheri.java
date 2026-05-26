class Studentt1
{
	int rollno;
	void getno()
	{
		rollno=111;
	}
	void putno()
	{
		System.out.println("rollno is : "+rollno);
	}
}
class Testt1 extends Studentt1
{
	int part1,part2;
	void getmarks()
	{
		part1=19;
		part2=18;
	}
	void putmarks()
	{
		System.out.println("marks of part 1 :"+part1);
		System.out.println("marks of part 2 :"+part2);
	}
}
interface Sportt1
{
	final int sportwt=20;
	abstract void putwt();
}
class Resultt1 extends Testt1 implements Sportt1
{
	int total;
	public void putwt()
	{
		System.out.println("marks of sportwt is : "+sportwt);
	}
	void display()
	{
		total=part1+part2+sportwt;
		System.out.println("total marks of all is : "+total);
	}
}
class Resultt1AccessInheri
{
	public static void main(String args[])
	{
		Resultt1 r1=new Resultt1();
		r1.getno();
		r1.getmarks();
		r1.putno();
		r1.putmarks();
		r1.putwt();
		r1.display();	
	}
}