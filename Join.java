package Code_of_thread;

class remote1 extends Thread
{
	
	public void run()
	{
		System.out.println("Entry start :");
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);			
		}
		System.out.println("Entry End ");
	}
	
}


class remote2 extends Thread
{
	public void run()
	{
		System.out.println("Process start :");
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);			
		}
		System.out.println("Process End ");	
	}
}

class remote3 extends Thread
{
	public void run()
	{
		System.out.println("Program start :");
		try 
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e) 
		{
			System.out.println(e);			
		}
		System.out.println("Program End ");
	}
}


public class Join_Thread 
{

	public static void main(String[] args) throws InterruptedException 
	{

		remote1 r1 = new remote1();
		r1.start();
		r1.join();
		remote2 r2 = new remote2 ();
		r2.start();
		r2.join();
		remote3 r3=new remote3();
		r3.start();
		r3.join();
		
	}

}
