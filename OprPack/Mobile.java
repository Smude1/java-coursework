package OprPack;
public class Device
{
	String vendorName;
	int ramSize;
	double OSVersion;
	public void getdata()
	{
		vendorName="Redmi";
		ramSize=4;
		OSVersion=5.1;
	}
}
public interface Loader
{
	abstract void loadOS();
}
public class Mobile extends Device implements Loader
{
	public void loadOS()
	{
		System.out.println("\n\tvendor name is : "+vendorName);
		System.out.println("\tram size  is : "+ramSize);
		System.out.println("\tOSVersion is : "+OSVersion);
	}
}
