public class MyClass
{
	int num;
	public MyClass()
	{
		num=0;
	}
	public MyClass(int num)
	{
		this.num=num;
	}
	public static void main(String []args)
	{
		MyClass M1=new MyClass();
		if(args.length>0)
		{
			int n=Integer.parseInt(args[0]);
			MyClass M2=new MyClass(n);
			System.out.println(M1.num);
			System.out.println(M2.num);
		}
		else
		{
			System.out.println("Insufficient Arguments");
		}
	}
}