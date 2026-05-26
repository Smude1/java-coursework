//String is the class from lang package

class StringClassMethodsDemo
{
	public static void main(String args[])	
	{
		String str1=new String("Suraj");
		System.out.println("name is : "+str1);
	
		String str2=str1.toLowerCase();	//returns lowercase string
		System.out.println("lower case name is : "+str2);
		
		String str3=str1.toUpperCase();	//returns uppercase string
		System.out.println("upper case name is : "+str3);
		
		String s2=new String("  hello  ");
		String str4=s2.trim();		//trims first and last spaces in string
		System.out.println("trimmed name is : "+str4);

		String s3=new String("amit");
		String str5=s3.replace('a','s');		//character 'a' is replaced with 's' (i.e smit)
		System.out.println("replaced name is : "+str5);
	
		int str6=s3.length();		//returns length of amit (i.e 4)
		System.out.println("length of "+s3+" is : "+str6);
	
		char str7=s3.charAt(2-1);		//returns character that is associated with index(i.e m)
		System.out.println("character at index is : "+str7);

		String str8=s2.concat(s3);		//joins to strings 
		System.out.println("concatinated name is : "+str8);

		String s4=new String("amit");
		int str9=s3.compareTo(s4);		//compares name ,if equal returns 0
		System.out.println("compared name is : "+str9);
			
		int idx=str1.indexOf('a');		//returns index of character(i.e 3)
		System.out.println("index of  character is : "+idx);

		int idx2=s4.indexOf('i',2);
		System.out.println("index is : "+idx2);
	
		String s5=new String("ashish");
		String s6=new String("ashish");
		boolean str11=s5.equals(s6);		//checks if string 1 is equals to another string,if equal returns true else false
		System.out.println("is "+s5+" is equals as "+s6+"? "+str11);

		String s7=new String("ashish");
		String s8=new String("ASHish");
		boolean str12=s7.equalsIgnoreCase(s8);	//checks if string 1 is equals to another string,but it ignores , it doesn't checks the case of character whether it is uppercase or lower case
		System.out.println("is "+s7+" is equals as "+s8+"? "+str12);
		
		String substr=s7.substring(3);		//gives characters after 3rd index
		System.out.println("substring of "+s7+" is :"+substr);

		String substr2=s7.substring(2,5);	//gives characters between 2nd idx position and 5th -1 idx position
		System.out.println("substring of "+s7+" is :"+substr2);

		
		System.out.println("\n\n\n\nPappu urf Ukesh");
		
	}
}