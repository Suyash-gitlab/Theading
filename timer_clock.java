package Code_of_thread;

public class timer_clock 
{

	public static void main(String[] args) throws InterruptedException 
	{
	for(int d=0;d<=30;d++)	
	{
		for(int h=0;h<=23;h++)
			{
				for(int m=0;m<=59;m++)
				{
					for(int s=0;s<=59;s++)
					{
						Thread.sleep(1);
						System.out.println(d+" day "+h+" Hour "+m+" minute "+s+" second");
					}
				}
			}
		}
	}
	

}
