class add extends Thread
{
    int a,b,sum;
	public void run(int a,int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
		try
		{
			Thread.sleep(5000);;
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("\n a = "+a);
		System.out.println("\n b = "+b);
		System.out.println("\n Sum = "+sum);
	}
}
class Param_NA1
{
	public static void main(String []args)
	{
		new add().run(67,54);
		new add().run(43,21);
		new add().run(21,78);
	}
}