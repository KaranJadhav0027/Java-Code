//program to print tables
public class B_tables
{
	public static void main(String []args)
	{
		int i=1,j=1;
		System.out.println("\n----Tables-----\n");
		while(i<=2)
		{
			while(j<=30)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
				j++;
			}
			i++;
			//System.out.println("");
			//System.out.println("");
		}
	}
}