import java.util.*;
class VectorDemo
{
	public static void main(String args[])
	{
		Vector v1=new Vector(3,4);
		System.out.println("capacity is : "+v1.capacity());
		v1.addElement("Suraj");
		v1.addElement("mude");
		v1.addElement("at");
		v1.addElement(1);
		System.out.println("size is : "+v1.size());
		System.out.println("element is : "+v1.get(0));
		System.out.println("element is : "+v1.get(1));
		System.out.println("element is : "+v1.get(2));
		System.out.println("element is : "+v1.get(3));
		System.out.println("capacity is : "+v1.capacity());

		
		
	}
}