//program to print traingle of numbers
public class B_triangle
{
	public static void main(String []args)
	{
		int i=1,j=1;
		do
		{
			int k=5;
			do
			{
				System.out.print(" ");
				k--;
			}while(k>=i);
			j=1;
			do
			{
				System.out.print(i+" ");
				j++;
			}while(j<=i);
			System.out.println("");
			i++;
		}while(i<=5);
	}
}