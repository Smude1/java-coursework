class SumEven
{
	public static void main(String args[])
	{
		int i,sumeven=0;
		System.out.println("even numbers are : ");
		for(i=0;i<20;i++)	
		{
			if(i%2==0)
			{
				System.out.print(i+", ");
				sumeven=sumeven+i;
			}
		}
		System.out.println("\nsum of even numbers are : "+sumeven);
	}
}