package Code_of_thread;

class person1 extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println("I am person one ");
		}
	}
}

class person2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I am person two ");
		}
	}
}


class person3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("I am person Three ");
		}
	}
}




public class yeilds_thread 
{

	public static void main(String[] args) 
	{

		person1 p1 = new person1();
		p1.start();
		person2 p2 = new person2();
		p2.start();
		person3 p3 = new person3();
		p3.start();
		
	}

}
