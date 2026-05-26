class WrapperFloatDemo
{
	public static void main(String args[])
	{
		String str ="4.5"; 	//converting String value into Float value	
		float f=Float.parseFloat(str);
		System.out.println("\nstring converted in Float value : "+(f*f));

		
		float flt1 =(float)4.3;	 //converting Float value into string value	
		String floatstr=Float.toString(flt1);
		System.out.println("converted Float value into string value is : "+floatstr);

		//conversion of Float objects into primitive types
		Float f1=new Float(6.4);

		byte b1=f1.byteValue();	//converting into byte value
		System.out.println("\n\nconverted Float object value in byte value    : "+(b1+b1));
		
		short s1=f1.shortValue();	//converting into short value
		System.out.println("converted Float object value in short value   : "+(s1+s1));

		int i1=f1.intValue();		//converting into integer value
		System.out.println("converted Float object value in integer value : "+(s1*s1));	
		
		long l1=f1.longValue();	//converting into long value
		System.out.println("converted Float object value in long value    : "+(l1*l1));
		
		double d1=f1.floatValue();	//converting into float value
		System.out.println("converted Float object value in float value   : "+(f1*f1));
		
		//converting decimal value into hexadecimal string
		float decimalval3=(float)12.5;
		String hexa1=Float.toHexString(decimalval3);
		System.out.println("converted decimal value into hexadecimal string is : "+hexa1);

	}
}