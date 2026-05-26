import java.util.*;
class vectorDemo2
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		v1.addElement(new Integer(10));
		v1.addElement(new Integer(30));
		v1.addElement(new Integer(50));
		v1.addElement(new Integer(20));
		v1.addElement(new Integer(40));
		v1.addElement(new Integer(10));
		v1.addElement(new Integer(20));
		
		System.out.println("original size is : "+v1.size()+"\n");
		System.out.println("original elements of vector are : ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.print("\t"+v1.get(i));	//we can also write this shortly as ("vector elements are : "+v1) , instead of loop
		}
		
		
		v1.removeElementAt(2);
		v1.removeElementAt(3);

		System.out.println("\ncurrent size is : "+v1.size()+"\n");
		System.out.println("current elements of vector are : ");
		for(int i=0;i<v1.size();i++)
		{
			System.out.print("\t"+v1.get(i));
		}
	}
}