import java.util.*;
class Book
{
	String title,name;
	double price;
	void get()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter book title : ");
		title=uk.next();
		System.out.println("enter book author name : ");
		name=uk.next();
		System.out.println("enter book price : ");
		price=uk.nextDouble();
	}
	void put()
	{
		System.out.println("\tbook's information is\n\t "+"title :"+title+"\n"+"\tauthor name : "+name+"\n"+"\tbook price : "+price);
	}
	
}
class BookAccess
{
	public static void  main(String args[])
	{
		Book b1=new Book();
		b1.get();
		b1.put();
	}
}

