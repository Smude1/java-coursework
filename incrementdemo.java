class incrementdemo
{
	public static void main(String args[])
	{
	               	int a=12,b=6,c=4;
		c=++b + --a; 
		b= c++ * ++b; 
 		a= --a + ++b;
 		
		System.out.println("value is : "+a); 
		System.out.println("value is : "+b);
		System.out.println("value is : "+c);
	}
}