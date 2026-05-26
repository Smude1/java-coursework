import java.util.*;
class StringConcat
{
	public static void main(String args[])
	{
		String name1,name2,name3;
		Scanner usa=new Scanner(System.in);	
		System.out.println("enter the first name : ");
		name1=usa.next();
		System.out.println("enter the middle name : ");
		name2=usa.next();
		System.out.println("enter the surname name : ");
		name3=usa.next();

		String str=name1.concat("  ");
		String str2=str.concat(name2);
		String str3=str2.concat("  ");
		String str4=str3.concat(name3);
		
		System.out.println("\n\tconcatenated name is : "+str4);
	}	

}
