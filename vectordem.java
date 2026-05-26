import java.util.*;
class vectordem
{
	public static void  main(String args[])
	{
		int n;
		Vector v1=new Vector();
		v1.addElement(10);
		v1.addElement(30);
		v1.addElement(50);
		v1.addElement(20);
		v1.addElement(40);
		v1.addElement(10);
		v1.addElement(20);

		System.out.println("the original elements of vector is : "+v1);
		System.out.println("the original size of vector is : "+v1.size());
		v1.removeElementAt(2);
		v1.removeElementAt(3);
		System.out.println("the elements of vector after removing  is : "+v1);
		
		v1.insertElementAt(55,2);
		System.out.println("the elements after adding in vector is : "+v1);
		v1.removeElement(55);
		System.out.println("the size of vector is : "+v1.size());
		System.out.println("the elements of vector is : "+v1);
	}
}