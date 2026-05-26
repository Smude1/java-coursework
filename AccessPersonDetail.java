class PersonEx
{
	String name;
	int age;
	void acceptInfo()	
	{
		name="Suraj";
		age=17;
	}
}
interface PersonDisp
{
	abstract void displayInfo();
}
class PersonDetail extends PersonEx implements PersonDisp
{
	public void displayInfo()
	{
		System.out.println("name of the person is : "+name);
		System.out.println("age of the person is : "+age);
	}
}
class AccessPersonDetail
{
	public static void main(String args[])
	{
		PersonDetail p1= new PersonDetail();
		p1.acceptInfo();
		p1.displayInfo();
	}
}