import java.util.*;
class CalcuDemo
{
	public static void main(String args[])
	{
		int days,months,weeks;
		Scanner ind=new Scanner(System.in);
		
		System.out.println("enter the days : ");
		days=ind.nextInt();

		months=days/30;
		days=(days-(months*30));
		weeks=days/7;
		days=(days-(weeks*7));

		System.out.println("\n\tmonths are : "+months);
		System.out.println("\n\tweeks are : "+weeks);
		System.out.println("\n\tdays are : "+days);

	}
}