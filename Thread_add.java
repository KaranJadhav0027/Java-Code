class add extends Thread
{
	int sum,a,b;
	public void run(int a,int b)
	{
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		sum=a+b;
		System.out.println("Addition : "+sum);
	}
}
class Thread_add
{
	public static void main(String []args)
	{
		new add().run(34,40);
	}
}