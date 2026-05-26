import java.util.*;
class VectorPra
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		Integer i1=new Integer(12);
		Integer i2=new Integer(42);
		
		String s1=new String("suraj");
		String s2=new String("mude");
		
		Float f1=new Float(12.24);
		Float f2=new Float(23.24);

		v1.addElement(i1);
		v1.addElement(i2);
		v1.addElement(s1);
		v1.addElement(s2);
		v1.addElement(f1);
		v1.addElement(f2);
		
		System.out.println("elements in vector : "+v1);
		v1.removeElement(f1);
		v1.removeElementAt(3);
		System.out.println("elements in vector : "+v1);
	}
}