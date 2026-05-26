class ThreadDemo
{
	public static void main(String args[]) throws Exception
	{
		Thread t1=Thread.currentThread();
		System.out.println("the curent thread is : "+t1.getName());
		System.out.println("priority of thread is : "+t1.getPriority());
		t1.sleep(3000);
		System.out.println("thanks for waiting !");
		t1.setName("Suraj");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("the curent thread is : "+t1.getName());
		System.out.println("priority of thread is : "+t1.getPriority());
	}
}