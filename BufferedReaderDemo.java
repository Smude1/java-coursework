import java.io.*;
class BufferedReaderDemo
{
	public static void main(String args[])
	{

		try
		{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			System.out.println("enter 3 numbers : ");
			int no1=Integer.parseInt(br.readLine());
			int no2=Integer.parseInt(br.readLine());
			int no3=Integer.parseInt(br.readLine());

			if(no1>=no2 && no1>=no3)
			{
				System.out.println("gretest number is : "+no1);
			}
			else
			{
				if(no2>=no3 && no2>=no1)
				{
					System.out.println("gretest number is : "+no2);
				}
				else
				{
					System.out.println("gretest number is : "+no3);
				}
			}
		}
		catch(Exception e)
		{
			
		}
		
	}
}