class param
{
	param(int p)
	{
		System.out.println("p is :"+p);
	}
	void displayparam()
	{
		System.out.println("hello im param");
	}
}		
class param2 extends param
{
	int b;
	param2(int b1,int b2)
	{
		super(b2);
		super.displayparam();
		b=b1;	
		System.out.println("b is :"+b);

	}
	
}
class param3 extends param2
{
	int a; 
	param3(int aa,int bb,int cc)
	{
		super(bb,cc);
		a=aa;
		System.out.println("a is :"+a);
	}
}
class paramInheri
{
	public static void main(String args[])	
	{
		param3 p3=new param3(10,20,30);
	}
}