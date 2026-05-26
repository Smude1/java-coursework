class ABC
{
	ABC()
	{
		System.out.println("\tim from ABC !");
	}
}
class PQR extends ABC
{
	PQR()
	{
		System.out.println("\tim from PQR!!");
	}
}
class XYZ extends PQR
{
	XYZ()
	{
		System.out.println("\tim from XYZ!!");
	}
}
class InheriConstr
{
	public static void main(String args[])
	{
		XYZ x1=new XYZ();
	}

}