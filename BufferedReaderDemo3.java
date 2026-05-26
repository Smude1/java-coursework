import java.io.*;
class BufferedReaderDemo3
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);
		System.out.println("enter the number to find factorial : ");
		int n=Integer.parseInt(usa.readLine());
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of given number is : "+fact);
	}
}