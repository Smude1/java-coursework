class MultiplicationTable
{
	p	ublic static void main(String args[])
	{
		int i=1;
		do
		{
			int j=1;
			do
			{
				System.out.print("     "+(i*j));
				j++;
			}
			while(j<=10);
			System.out.println("\n");
			i++;
		}
		while(i<=10);
	}
}