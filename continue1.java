class continue1
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				System.out.println("ram:" +j);
				if(j==2)
				{
					continue;
				}
				System.out.println("hello !");
			
			}
		}
	}
}
 