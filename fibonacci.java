//program for fibonacci series
public class fibonacci
{
	public static void main(String []args)
	{
		int n;
		n=Integer.parseInt(args[0]);
		System.out.println("Fibonacci series are : ");
		int f1,f2=0,f3=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
	}
}