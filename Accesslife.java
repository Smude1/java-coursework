//			 !! Radhe Radhe !!

//	#the human thinkings , implemented into code :-) (:-O)
		
class life
{

	void eat()
	{
		System.out.println("whatever you wanna eat!!!"+"\n");
	}
	void code()
	{
		System.out.println("< just code , code and code #programmer's_life />"+"\n");
	}
	void sleep()
	{
		System.out.println("zzz  zzzz "+"\n");
	}
	void repeat()
	{
		this.eat();
		this.code();
		this.sleep();
	}
	
}
class Accesslife
{
	public static void main(String args[])
	{
		life good=new life();
		int alive=1;
		int life=100;
		while(life>alive)
		{
			good.eat();
			good.code();
			good.sleep();
			good.repeat();
		
			alive++;
			
		}
	}
}