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
class XYZ extends ABC
{
	XYZ()
	{
		System.out.println("\tim from XYZ!!");
	}
}
class InheriConstrHierarch
{
	public static void main(String args[])
	{
		PQR p1=new PQR();
		XYZ x1=new XYZ();
	}

}