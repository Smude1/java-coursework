class FindEven
{
	public static void  main(String args[])
	{
		int i,count=0;
		System.out.println("the even numbers are :");
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			{	
				count++;
				System.out.print(i+" , ");
			}
		}
		System.out.println("\n\nnumber of even numbers from 1 to 100 are : "+count);
	}
}