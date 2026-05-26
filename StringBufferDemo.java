class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer stb=new StringBuffer("ram");
		System.out.println("capacity is : "+stb.capacity());

		stb.append("laxman"); 	//this method concatenates strings
		System.out.println("after append string is : "+stb);

		stb.insert(3,"sita");		//inserts string at specific index position
		System.out.println("after insert into string is : "+stb);

		stb.replace(3,7,"hanuman");		//replace string from specific index to specific index
		System.out.println("after replace into string is : "+stb);

		stb.reverse();	//reverse the string
		System.out.println("after reverse the string : "+stb);

		stb.reverse();
		System.out.println("after reverse the string : "+stb);

		System.out.println("fetched specific index character  : "+stb.charAt(3));
		
		int uk=stb.length();		//returns the length of string
		System.out.println("string length is : "+uk);

		String usa=stb.substring(3);		//returns further string from the index
		System.out.println("string after entered index : "+usa);

		String aus=stb.substring(3,10);		//returns further string from the index 3 to index 10
		System.out.println("string after entered index : "+aus);

		stb.delete(3,10);
		System.out.println("deleted string from spicific index to index : "+stb);
	}
}