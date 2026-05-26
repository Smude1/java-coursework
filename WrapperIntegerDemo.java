class WrapperIntegerDemo 
{
	public static void main(String args[])
	{
		//converting numeric string into integer number
		String str="1234";
		int no=Integer.parseInt(str);
		System.out.println("numeric string into integer  result is : "+no);
		System.out.println("number addition result is : "+(no+no)); //performed addition operation

		//converting integer value into string
		int n=122;
		String str1=Integer.toString(n);
		System.out.println("converted integer value into string is : "+str1);

		//converting integer object into primitive types
		//1.converting into byte
		Integer i1=new Integer(12);
		byte b1 = i1.byteValue();
		System.out.println("\n\ninteger obj into bytevalue : "+b1);
		
		//2.converting into short value
		short s1= i1.shortValue();
		System.out.println("short value is : "+(s1+s1));
		
		//3.converting into long value
		long l1=i1.longValue();
		System.out.println("long value is : "+l1);
		
		//4.converting into float value
		float f1=i1.floatValue();
		System.out.println("float value is : "+f1);
		
		//5.converting into double value
		double d1=i1.doubleValue();
		System.out.println("double value is : "+(d1+d1));


		//converting binary string into decimal value
		String binstr="0011";
		int deci=Integer.parseInt(binstr,2);	
		System.out.println("\n\nconverted binary string into decimal value is : "+deci);
		
		//converting decimal value into binary string
		int deci1=15;
		String binstr1=Integer.toBinaryString(deci1);
		System.out.println("decimal value converted into binary string is : "+binstr1);


		//converting binary value into octal string
		int binval=1010;
		String octstr=Integer.toOctalString(binval);
		System.out.println("\n\nconverted binary value into octal string is : "+octstr);

		//converting decimal value into octal string
		int deci2=81;
		String binstr2=Integer.toOctalString(deci2);
		System.out.println("converted decimal value to octal string is : "+binstr2);
	
		//octal string to decimal value
		String octstr1="121";
		int decimalval=Integer.parseInt(octstr1,8);
		System.out.println("converted octal string to decimal value is : "+decimalval);

		
		//converting hexadecimal string to decimal value
		String hexaa="a2b";
		int par=Integer.parseInt(hexaa,16);
		System.out.println("converted hexadecimal string to decimal value is : "+par);
		
		 //converting decimal value into hexadecimal string
		int decimalval3=1221;
		String hexa1=Integer.toHexString(decimalval3);
		System.out.println("converted decimal value into hexadecimal string is : "+hexa1);
			
		
	}
}