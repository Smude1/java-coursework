class Studenttt
{
	int age;
	String name;
	Studenttt()
	{
		age=17;
		name="Suraj";
		System.out.println("age is : "+age);
		System.out.println("name is : "+name);
	}
	Studenttt(int ag,String nm)
	{
		System.out.println("age of student is : "+ag);
		System.out.println("name of student is : "+nm);
	}
}
class AccessStudenttt
{
	public static void main(String args[])
	{
		Studenttt s1=new Studenttt();
		Studenttt s2=new Studenttt(20,"Aditya");
	}
}