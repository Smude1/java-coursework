class Device
{
	String vendorName;
	int ramSize;
	double OSVersion;
	void getdata()
	{
		vendorName="Redmi";
		ramSize=4;
		OSVersion=5.1;
	}
}
interface Loader
{
	abstract void loadOS();
}
class Mobile extends Device implements Loader
{
	public void loadOS()
	{
		System.out.println("\n\tvendor name is : "+vendorName);
		System.out.println("\tram size  is : "+ramSize);
		System.out.println("\tOSVersion is : "+OSVersion);
	}
}
class AccessMobile
{
	public static void main(String args[])
	{
		Mobile m1=new Mobile();
		m1.getdata();
		m1.loadOS();
	}
}