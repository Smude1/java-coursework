class finalVariableDemo
{
	public static void main(String args[])
	{
		final int i=4;
		i=i+10;	//you cannot change the value of variable when you make it final with final keyword,
		System.out.println("i is : "+i );
		i=i+25;
		System.out.println("i is : "+i);
	}
}