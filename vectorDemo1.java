import java.util.*;
class vectorDemo1
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		v1.addElement(new String("Suraj"));
		v1.addElement(new String("aditya"));
		v1.addElement(new String("akshay"));
		v1.addElement(new String("ashish"));
		System.out.println("size is : "+v1.size());
		for(int i=0;i<v1.size();i++)
		{
			System.out.println("element is : "+v1.get(i));
		}
		
		String str[]=new String[v1.size()];
		v1.copyInto(str);
		
		System.out.println("size is : "+str.length);
		for(int i=0;i<str.length;i++)
		{
			System.out.println("element is : "+str[i]);
		}
	}
}