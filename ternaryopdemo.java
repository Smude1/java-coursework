import java.util.*;
class ternaryopdemo
{
	public static void main(String args[])
	{
		Scanner usa=new Scanner(System.in);
		System.out.println("enter any character : ");
		String str1=usa.next();
		char ch=str1.charAt(0);
		String str2=(ch>=65 && ch<=90)?"uppercase alpabet": (ch>=97 && ch<=122)?"lowercase alphabet" : (ch>=48 && ch<=57)?"digit": "special symbol";
		
		System.out.println(str2);
	}
}