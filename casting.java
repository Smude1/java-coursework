class casting
{
	public static void main(String args[])
	{
		
		//this is explicit type casting
		long a=12;
		int b=(int)a;
		short c=(short)b;
		byte d=(byte)c;

		System.out.println("value is  : "+a);
		System.out.println("value is  : "+b);
		System.out.println("value is  : "+c);
		System.out.println("value is  : "+d);

		//this must be implicit type casting
		int a=5;
		double b=a;
		System.out.println("value is  : "+a);
		System.out.println("value is  : "+b);
		//System.out.println("value is  : "+c);
		//System.out.println("value is  : "+d);
	}
}