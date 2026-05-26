import java.util.*;
class VectorMethods
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		System.out.println("capacity is : "+v1.capacity());		//used for how much elements can be stored in vector
		System.out.println("size is : "+v1.size());	//to check how much elements are there in the vector
		
		v1.addElement("Suraj");	//to insert the element 
		v1.addElement("how");
		v1.addElement("are");
		v1.addElement("you");
		v1.addElement("doing !");
		
		System.out.println("Elements in the vector are : "+v1);	//display
		v1.insertElementAt("bhai",1);	//to insert element at the perticular location in the vector as per index location

		System.out.println("Elements in the vector are : "+v1);
		System.out.println("first Element in the vector is : "+v1.firstElement());	//for the first element 
		System.out.println("last Element in the vector is : "+v1.lastElement());	//for the alst element
	}
}