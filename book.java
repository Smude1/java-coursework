import java.util.*;
class Book
{
	int a=22,b=11;
	static int c;
	void put()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter the  value of a and b  :");
		a=uk.nextInt();
		b=uk.nextInt();
		
		c=c+4;
	}
	void put()
	{
		int d=5;
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);
		System.out.println("c is : "+c);
		System.out.println("d is : "+d);

	}
}
class AccessBook
{
	public static void main(String args[])
	{
		Book b1=new Book();
		Book b2=new Book();

		b1.get();
		b2.get();
		System.out.println(".................................................");
		b1.put();
		b2.put();
		System.out.println(".................................................");
	}

}