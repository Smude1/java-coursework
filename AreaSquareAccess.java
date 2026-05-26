import java.io.*;
class square
{
	int side;
	void accept() throws Exception
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader usa= new BufferedReader(isr);
		
		System.out.println("enter the side of square: ");
		side =Integer.parseInt(usa.readLine());
	}
}
class AreaSquare extends square
{
	int area;
	void calculate()
	{
		System.out.println("\tthe area of square is : "+(side*side));
	}
}
class AreaSquareAccess
{
	public static void main(String args[])	throws Exception
	{
		AreaSquare a1= new AreaSquare ();
		a1.accept();
		System.out.println("\n.............................................................................");
		a1.calculate();
		System.out.println(".................................................................................");
	}
}