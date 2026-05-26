class loopfor
{
	public static void main(String args[])
	{
		int i,j,n=5;
		for(i=1;i<=n;i++)
		{
			int s=1;
			for(j=n;j>=i;j--)
			{
				System.out.print(" "+s);
				s++;
			}
			System.out.println("\n");
		}
	}
}