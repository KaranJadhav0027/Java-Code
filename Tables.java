public class Tables
{
	public static void main(String []args)
	{
		int i=1,j=1;
		System.out.println("Tables");
		while(i<=2)
		{
			while(j<=10)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
				i++; //for sqaure the number
				j++;
			}
			i++; //for tables
			System.out.println(" ");
			System.out.println(" ");
		}
	}
}