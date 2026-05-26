import java.util.*;
class StringAlphabetical
{
	public static void main(String args[])
	{
		
		Scanner usa=new Scanner(System.in);
		String name[]=new String[10];
		System.out.println("Enter 10 names : ");
		for(int i=0;i<10;i++)
		{
			name[i]=usa.next();
		}
		int j;
		for(int i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(name[i].compareTo(name[j])>0)
				{
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		System.out.println("alphabetical string are : ");
		for(int i=0;i<10;i++)
		{
			System.out.println(name[i]);
		}
		
	}
}