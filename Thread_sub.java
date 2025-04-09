class sub extends Thread
{
	int subt,a,b;
	public void run(int a,int b)
	{
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		subt=a-b;
		System.out.println("Subtraction : "+subt);
	}
}
class Thread_sub
{
	public static void main(String []args)
	{
		new sub().run(89,43);
	}
}