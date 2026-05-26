import java.util.*;
class VectorDemo7
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		Scanner usa=new Scanner(System.in);
		System.out.println("how many elements you want to store ? ");
		int n=usa.nextInt();
		System.out.println("enter "+n+" elements :");
		for(int i=0;i<n;i++)
		{
			int item=usa.nextInt();
			v1.addElement(new Integer(item));
		}
		System.out.println("current elements of vector are : ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.print("\t"+v1.get(i));
		}

		System.out.println("\n\nenter element to Replace :  ");
		int repl=usa.nextInt();
		System.out.println("\nat which index position you want to Replace ?");
		int idx=usa.nextInt();
		
		v1.set(idx-1,repl);
		System.out.println("current elements of vector are : "+v1);

	}
}