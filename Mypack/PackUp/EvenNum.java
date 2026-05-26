package Mypack.PackUp;
import java.util.*;
public class EvenNum
{
	int n;
	Scanner usa=new Scanner(System.in);
	public void getEven()
	{
		System.out.println("enter numner to find it is even or odd : ");
		n=usa.nextInt();
		if(n%2==0)
		{
			System.out.println("number is even : "+n);
		}
		else
		{
			System.out.println("number is odd : "+n);
		}
	}
}