class Prime_n
{
	static boolean isPrime(int n)
	{
		if(n==1 || n==0)
		{
			return false;
		}
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String []args)
	{
		int x=Integer.parseInt(args[0]);
		System.out.println("Prime numbers are : ");
		for(int i=1;i<=x;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}
}