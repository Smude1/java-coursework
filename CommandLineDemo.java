class CommandLineDemo
{
	public static void main(String args[])
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		
		System.out.println("Addition is : "+(a+b));
		System.out.println("subtraction is : "+(a-b));
		System.out.println("multiplication is : "+(a*b));
		System.out.println("division is : "+(a/b));
		
	}
}