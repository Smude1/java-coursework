import java.util.*;
class VecPra
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		v1.addElement(args[0]);
		for(int i=1;i<=v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
	}
}