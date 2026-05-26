import java.util.*;
class ternaryy
{
	int n1,n2;
	Scanner usa=new Scanner(System.in);
	void get()
	{
		System.out.println("enter two  numbers : ");
		n1=usa.nextInt();
		n2=usa.nextInt();
	}
	void put()
	{
		String str=(n1>n2)?"largest number is : "+n1 : "largest number is : "+n2;
		System.out.println(str);
	}
}
class AccessTernaryOP
{
	public static void main(String args[])
	{
		ternaryy t1=new ternaryy();
		t1.get();
		t1.put();
	}
}