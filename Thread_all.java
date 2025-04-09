class add extends Thread
{
	int sum,a,b;
	public void run(int a,int b)
	{
		System.out.println("\na : "+a);
		System.out.println("b : "+b);
		sum=a+b;
		System.out.println("Addition : "+sum);
	}
}
class subt extends Thread
{
	int subt,a,b;
	public void run(int a,int b)
	{
		System.out.println("\na : "+a);
		System.out.println("b : "+b);
		subt=a-b;
		System.out.println("Subtraction : "+subt);
	}
}
class mul extends Thread
{
	int multi,a,b;
	public void run(int a,int b)
	{
		System.out.println("\na : "+a);
		System.out.println("b : "+b);
		multi=a*b;
		System.out.println("Multiplication : "+multi);
	}
}
class div extends Thread
{
	int division,a,b;
	public void run(int a,int b)
	{
		System.out.println("\na : "+a);
		System.out.println("b : "+b);
		division=a/b;
		System.out.println("Division : "+division);
	}
}
class rem extends Thread
{
	int remd,a,b;
	public void run(int a,int b)
	{
		System.out.println("\na : "+a);
		System.out.println("b : "+b);
		remd=a%b;
		System.out.println("Remainder : "+remd);
	}
}
class Thread_all
{
	public static void main(String []args)
	{
		new add().run(34,40);
		new sub().run(78,65);
		new mul().run(34,4);
		new div().run(65,3);
		new rem().run(54,7);
	}
}