import java.io.*;
public class Tables_15
{
	public static void main(String []args)
	{
		int i,j,k;
		for(i=1;i<=10;i++)
		{
			for(j=2;j<=15;j++)
			{
				k=i*j;
				System.out.print(j+" "+"*"+i+" "+" = "+k+"\t");
			}
			System.out.println();
		}
	}
}