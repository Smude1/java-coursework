interface ABC
{
	int a=5;
	abstract void get();
}
class PQR
{
	int b=45;
	void put()
	{
		System.out.println("whats upp !!");
	}
}
class AccessPqr extends PQR implements ABC
{
	public void get()
	{
		System.out.println("from ABC");
	}
}
class AccessPQRbody
{
	public static void main(String args[])
	{
		AccessPqr a1= new AccessPqr();
		a1.get();
		a1.put();
	}
}