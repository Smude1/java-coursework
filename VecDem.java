import java.util.*;
class VecDem
{
	public static void  main(String args[])
	{
		Vector v1=new Vector();
		v1.addElement(10);
		v1.addElement(30);
		v1.addElement(50);
		v1.addElement(20);
		v1.addElement(40);
		v1.addElement(10);
		v1.addElement(20);
		
		System.out.println("original size of vector : "+v1.size());
		System.out.println("elements in vector are : "+v1);

		v1.removeElementAt(2);
		v1.removeElementAt(3);

		v1.insertElementAt(500,2);

		System.out.println("current size of vector : "+v1.size());
		System.out.println("elements in vector are : "+v1);

	}
}