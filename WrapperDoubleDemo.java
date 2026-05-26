class WrapperDoubleDemo
{
	public static void main(String args[])
	{
		String str ="4"; //converting String value into double value	
		double d=Double.parseDouble(str);
		System.out.println("string converted in double value : "+(d*d));

		double double1 =4.3;	 //converting double value into string value	
		String doubstr=Double.toString(double1);
		System.out.println("converted double value into string value is : "+doubstr);

		//conversion of double objects into primitive types
		Double d1=new Double(6.4);

		byte b1=d1.byteValue();	//converting into byte value	
		System.out.println("\n\nconverted double object value in byte value : "+(b1+b1));
		
		short s1=d1.shortValue();	//converting into short value
		System.out.println("converted double object value in short value : "+(s1+s1));

		int i1=d1.intValue();		//converting into integer value
		System.out.println("converted double object value in integer value : "+(s1*s1));	
		
		long l1=d1.longValue();	//converting into long value
		System.out.println("converted double object value in long value : "+(l1*l1));
		
		float f1=d1.floatValue();	//converting into float value
		System.out.println("converted double object value in float value : "+(f1*f1));
		
		//converting decimal value into hexadecimal string
		double decimalval3=122;
		String hexa1=Double.toHexString(decimalval3);
		System.out.println("converted decimal value into hexadecimal string is : "+hexa1);

	
	}
}