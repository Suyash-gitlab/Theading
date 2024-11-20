package Code_of_thread;

class music implements Runnable
{
	
	public void run() 
	{
		System.out.println("This ia music method");
	}
	
}

class video implements Runnable
{
	public void run()
	{
		System.out.println("This is video method");
	}
}

public class By_runable 
{

	public static void main(String[] args) 
	{

		video v = new video();
		Thread p = new Thread();
		p.start();
		music m = new music();
		Thread t = new Thread(m);
		t.start();
		
	}

}
