import java.util.*;
class gett
{
	int i,j;
	int n;
	void get()
	{
		Scanner uk=new Scanner(System.in);
		System.out.println("enter number : ");
		n=uk.nextInt();
		
	}
	void put()
	{
		for(i=n;i>=1;i--)
		{
			for(j=n;j>=i;j--)
			{
				System.out.print(j );
			}
			System.out.println("\n");
		}
	}
}
class gettAccess
{
	public static void main(String args[])
	{
		gett hii=new gett();
		hii.get();
		hii.put();
		
	}
}