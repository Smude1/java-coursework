import java.util.*;
class Tabledemo
{
	public static void main(String args[])
	{
		int i=1,n;
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the number for table : ");
		n=usa.nextInt();
		do
		{
			System.out.println("\n"+n+" x "+i+" = "+(n*i));
			i++;
		}
		while(i<=10);
	}			
	
}