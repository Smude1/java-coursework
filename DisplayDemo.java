import java.util.*;
class DisplayDemo
{
	public static void main(String args[])
	{
		int days,months,weeks;
		Scanner usa=new Scanner(System.in);
		System.out.println("\n\n\tenter the days :");
		days=usa.nextInt();
		
		months=days/30;
		days=(days-(months*30)); 	//it can also be days=days%30
		weeks=days/7;
		days=weeks%7;   		//it can also be days=(days-(weeks*7))
		
		
		System.out.println("\n\tmonths are : "+months);
		System.out.println("\n\tweeks are : "+weeks);
		System.out.println("\n\tdays are : "+days);


	}
}