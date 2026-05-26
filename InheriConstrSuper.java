class ABC
{
	int a;
	ABC(int a1 )
	{
		a=a1;
		System.out.println("\tim from ABC !");
		System.out.println("\ta is : "+a1);
	}
}
class PQR extends ABC
{
	int p;	
	PQR(int p1,int p2)
	{
		super(p2);
		p=p1;
		System.out.println("\tim from PQR!");
		System.out.println("\tp is : "+p);
	}
}
class XYZ extends PQR
{
	int x;
	XYZ(int x1,int x2 ,int x3)
	{
		super(x2,x3);
		x=x1;
		System.out.println("\tim from XYZ!");
		System.out.println("\tx is : "+x);
	}
}
class InheriConstrSuper
{
	public static void main(String args[])
	{
		XYZ x1=new XYZ(10,20,30);
	}

}