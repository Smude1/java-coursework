import java.util.*;
class MonthsDemo
{
	public static void main(String args[])
	{
		int months,days;
		Scanner uk=new Scanner(System.in);
		System.out.println("\n\tenter days : ");
		days =uk.nextInt();

		months=days/30;
		days=(days-(months*30));
		
		System.out.println("months are : "+months);
		System.out.println("days are : " +days);
	}
}