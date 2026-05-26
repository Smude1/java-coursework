import java.util.*;
class vectorDemo3
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		Scanner usa=new Scanner(System.in);
		v1.addElement(new Integer(10));
		v1.addElement(new Integer(20));
		v1.addElement(new Integer(30));
		v1.addElement(new Integer(40));
		v1.addElement(new Integer(50));
		v1.addElement(new Integer(60));
		v1.addElement(new Integer(70));
		System.out.println("current elements of vector are : ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.print("\t"+v1.get(i));
		}
		System.out.println("\nat which index you want to store the element  ? ");
		int ch=usa.nextInt();

		System.out.println("then enter the element : ");
		int el=usa.nextInt();

		v1.insertElementAt(el,ch-1);

		System.out.println(".........................................................");
		System.out.println("current elements of vector are : ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.print("\t"+v1.get(i));
		}
		System.out.println("\n.........................................................");
		
	}
}