import java.util.*;
class Ternarydemo3
{
	public static void main(String args[])
	{
		
		Scanner aus=new Scanner(System.in);
		System.out.println("enter character : ");
		String str1=aus.next();
		char ch=str1.charAt(0);

		String str2=(ch>=65 && ch<=90)? "uppercase alphabet" : (ch>=97 && ch<=122)? "lowercase alphabet ": (ch>=48 && ch<=57)? "digit ":"special symbol" ;

		System.out.println(str2);
	}
}