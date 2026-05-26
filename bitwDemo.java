import java.util.*;
class bitwDemo
{
	public static void  main(String args[])
	{
		int a,b,c,d,e;
		Scanner usa=new Scanner(System.in);
		System.out.println("a is : ");
		a=usa.nextInt();
		System.out.println("b is : ");
		b=usa.nextInt();
		
		c=a&b;
		d=a|b;
		e=a^b;
	
		System.out.println("AND operation is : "+c);
		System.out.println("OR operation  is : "+d);
		System.out.println("Exclusive OR operation is : "+e);

		System.out.println("\nLeft shift operation on a is  :" +(a<<1));
		System.out.println("Right shift operation on a is  :" +(a>>1));

		System.out.println("\nLeft shift operation on b is  :" +(b<<1));
		System.out.println("Right shift operation on b is  :" +(b>>1));
		
	}
}