class A implements Runnable {
//extends Thread{

	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("welcome to A");
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class B implements Runnable {
//extends Thread{

	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("In B");
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class MultiThreading
{
	public static void main(String[] s)
	{
		Runnable obj1 = new A();
		Runnable obj2 = new B();
		
		//obj1.show();
		//obj2.show();
		
		//obj1.setPriority(Thread.MAX_PRIORITY);
		//System.out.println(obj2.getPriority());
		
		//obj1.start();
		//obj2.start();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
	}
}