package Code_of_thread;
class Audio extends Thread
{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Song play");
		}
	}
}

class timer extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Song timer");
		}
	}
}

class pause extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Song pause");
		}
	}
}


public class Thread_by_extends 
{
	public static void main(String[] args) 
	{
		
		Audio a=new Audio();
		a.start();
		
		timer t = new timer();
		t.start();
		pause p = new pause();
		p.start();
		

	}

}
