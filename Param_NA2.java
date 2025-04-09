class sleepThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println("Param");
		}
	}
}
class Param_NA2
{
	public static void main(String []args)
	{
		sleepThread t1=new sleepThread();
		t1.start();
	}
}