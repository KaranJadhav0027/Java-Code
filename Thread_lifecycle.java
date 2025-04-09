import java.util.*;
class DemoThread extends Thread
{
	DemoThread(String nm)
	{
		super(nm);
	}
	public void run()
	{
	}
}
public class Thread_lifecycle
{
	public static void main(String []args)throws InterruptedException
	{
		DemoThread t1=new DemoThread("EnumTech");
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		System.out.println("Thread is running");
		System.out.println(t1.getName());
		Random r=new Random();
		int s=r.nextInt(5000);
		System.out.println("Thread will sleeping for "+s+" millisecs");
		try
		{
			t1.sleep(s);
		}
		catch(InterruptedException ie)
		{ }
		t1.join();
		System.out.println("Thread is no more ");
		System.out.println(t1.getState());
	}
}