import java.util.*;
class Book
{
	String author,title;
	int price;
	Scanner usa=new Scanner(System.in);
	void get()
	{
		System.out.println("enter autor name and price");
		author=usa.next();
		price=usa.nextInt();
	}
	void put()
	{
		System.out.println("author name is : "+author+"\nprice is : "+price);
	}
	
}
class BookInfo extends Book
{
	int StockPosition;
	void getposition()
	{
		System.out.println("enter stock ");
		StockPosition=usa.nextInt();
	}
	void putposition()
	{
		System.out.println(" the stocks are  : "+StockPosition);
	}
	
}
class AccessBookInfo
{
	public static void main(String args[])
	{
		BookInfo b1[]=new BookInfo[3];
		for(int i=0;i<3;i++)
		{
			b1[i]=new BookInfo();
			b1[i].get();
			b1[i].getposition();
		}
		for(int i=0;i<3;i++)
		{
			b1[i].put();
			b1[i].putposition();
		}
	}
}