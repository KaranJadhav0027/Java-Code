class transpose
{
	public static void main(String []args)
	{
		int a[][]={{10,20,30},{40,50,60}};
		System.out.println("Original array : ");
		print_array(a);
		System.out.println("After changing rows and columns : ");
		trans(a);
	}
	private static void trans(int a[][])
	{
		int b[][]=new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		print_array(b);
	}
	private static void print_array(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}