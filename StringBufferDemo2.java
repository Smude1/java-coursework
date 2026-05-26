import java.util.*;
class StringBufferDemo2
{
	public static void main(String args[])	
	{
		
		StringBuffer stb=new StringBuffer();
		
		Scanner usa=new Scanner(System.in);
		System.out.println("enter the String into StringBuffer : ");
		String name=usa.next();
		stb.insert(0,name);
		System.out.println("..............................................................");
		System.out.println("\n\tthe String in the StringBuffer is : "+stb);
		System.out.println("..............................................................");
		int cont;
		do
		{
			System.out.println("\n\tenter 1 to insert new String into StringBuffer : ");
			System.out.println("\n\tenter 2 to to know about  StringBuffer's capacity : ");
			System.out.println("\n\tenter 3 to know about  StringBuffer's length : ");
			System.out.println("\n\tenter 4 to replace String into StringBuffer : ");
			System.out.println("\n\tenter 5 to delete specific characters from StringBuffer : ");
			System.out.println("\n\tenter 6 to reverse String from StringBuffer : ");
			System.out.println("\n\tenter 7 to get specific character from StringBuffer : ");
			System.out.println("\n\tenter 8 to get further string from entered index StringBuffer : ");
			System.out.println("\n\tenter 9 to get string between 2 index positions : ");
			System.out.println("\n\tenter 10 to see original string : ");
			
	
			System.out.println("enter your choice : ");
			int choice=usa.nextInt();
			switch(choice)
			{
				case 1 : 
					System.out.println("at which index position u wanna insert string");
					int idx=usa.nextInt();
					System.out.println("enter string to insert into StringBuffer : ");	
					String str1=usa.next();
					stb.insert(idx,str1);
					System.out.println("\n..............................................................");
					System.out.println("after inserting string is : "+stb);
					System.out.println("..............................................................");
					break;
				case 2 : 
					System.out.println("\n..............................................................");
					System.out.println("the capacity of StringBuffer is : "+stb.capacity());
					System.out.println("..............................................................");
					break;
				case 3 :
					System.out.println("\n..............................................................");
					System.out.println("the length of StringBuffer is : "+stb.length());
					System.out.println("..............................................................");
					break;
				case 4 : 
					System.out.println("from hich index position u wanna replace string");
					int repl=usa.nextInt();
					System.out.println("to which index position u wanna replace string");	
					int repl1=usa.nextInt();
					System.out.println("enter string to replace");
					String rplc=usa.next();
					stb.replace(repl,repl1,rplc);

					System.out.println("\n..............................................................");
					System.out.println("String after replace : "+stb);
					System.out.println("..............................................................");
					break;
				case 5 : 
					System.out.println("from which index position u wanna delete string");
					int del=usa.nextInt();
					System.out.println(" to which index position u wanna delete string");
					int del1=usa.nextInt();
					stb.delete(del,del1);
					
					System.out.println("\n..............................................................");
					System.out.println("\nString after delete : "+stb);
					System.out.println("..............................................................");
					break;
				case 6 : 
					stb.reverse();
					System.out.println("\n..............................................................");
					System.out.println("String after reverse : "+stb);
					System.out.println("..............................................................");
					break;
				case 7 : 
					System.out.println("which index position's chaaracter u want ?  : ");
					int want=usa.nextInt();
					char ch=stb.charAt(want);
					System.out.println("\n..............................................................");
					System.out.println("here's your specific character : "+ch);
					System.out.println("..............................................................");
					break;
				case 8 :
					System.out.println("enter the index to get further string :  ");
					int fur=usa.nextInt();
					String sub2=stb.substring(fur);
					System.out.println("\n..............................................................");
					System.out.println("further's string from entered index : "+sub2);
					System.out.println("..............................................................");
					break;
				case 9 : 
					System.out.println("enter 1st index to get string further from : ");
					int fur1=usa.nextInt();
					System.out.println("enter 2st index to get string before from : ");
					int fur2=usa.nextInt();
		
					String sub1=stb.substring(fur1,fur2);
					System.out.println("\n..............................................................");
					System.out.println(" string between entered index : "+sub1);
					System.out.println("..............................................................");
					break;
				case 10 : 
					System.out.println("\n..............................................................");
					System.out.println("original string is :  "+stb);
					System.out.println(".............................................................");
					break;
				default : 
					System.out.println("wrong choice !");	
			}	
			System.out.println("\n\ndo u want to continue ,if yes press 1 ");	
			cont=usa.nextInt();
		}
		while(cont==1);
	}
}