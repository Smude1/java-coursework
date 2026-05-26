class breakDemo
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println("Ram : "+(i+j));	
				if(j==2)
				{
					break;

				}
			}
		}
	}
}