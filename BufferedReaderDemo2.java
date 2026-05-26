import java.io.*;
class BufferedReaderDemo2
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader usa=new BufferedReader(isr);
		System.out.println("enter any string");
		String str=usa.readLine();
		int n=str.length();
		int i=0,count=0;
		while(i<n)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				count++;
			}
			i++;
		}
		System.out.println("number of digits in String is : "+count);
		
	}
}