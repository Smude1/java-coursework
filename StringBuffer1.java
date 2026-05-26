import java.util.*;
class StringBuffer1
{
	public static void main(String args[])
	{
		StringBuffer name=new StringBuffer();
		Scanner usa=new Scanner(System.in);
		System.out.println("enter string  : ");
		String nam=usa.next();
		name.insert(0,nam);
		
		System.out.println("at which index  u want to insert ? ");
		int idx1=usa.nextInt();
	
		System.out.println("enter name to insert : ");
		String nm=usa.next();

		name.insert(idx1,nm);
		System.out.println("...............................................................");
		System.out.println("after inserting : "+name);
		System.out.println("...............................................................");
		
		System.out.println("\nfrom which index to which index u want to replace ? ");
		int idxx=usa.nextInt();
		int idxx2=usa.nextInt();

		System.out.println("enter name to replace ");
		String nav=usa.next();

		name.replace(idxx,idxx2,nav);
		System.out.println("\n...............................................................");
		System.out.println("\nafter replacing name is : "+name);
		System.out.println("...............................................................");
	}
}