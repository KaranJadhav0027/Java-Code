//Slip5_2
import java.io.*;
public class Matrix_MenuDriven
{
	public static void main(String []args)throws IOException
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int sum[][]=new int[2][2];
		int multi[][]=new int[2][2];
		int i,j;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first matrix elements ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			    a[i][j]=Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
	    System.out.println("Enter second Matrix elements ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			    b[i][j]=Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
		System.out.println("First Matrix elements are :");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			    System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("Second Matrix elements are :");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
			    System.out.print("  "+b[i][j]);
			}
			System.out.println();
		}
		while(true)
		{
			System.out.println();
			System.out.println("1.Addition ");
			System.out.println("2.Multiplication ");
			System.out.println("3.Exit ");
			System.out.println("Enter your choice ");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					System.out.println("Addition of matrices :");
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							sum[i][j]=a[i][j]+b[i][j];
							System.out.print(" "+sum[i][j]);
						}
						System.out.println();
					}
					break;
				case 2:
				    System.out.println("Multiplication of matrices : ");
					for(i=0;i<2;i++)
					{
						for(j=0;j<2;j++)
						{
							multi[i][j]=0;
							for(int k=0;k<2;k++)
							{
								multi[i][j]=multi[i][j]+(a[i][k]*b[k][j]);
								
							}
							System.out.print(" "+multi[i][j]);
						}
						System.out.println();
					}
					break;
				case 3:
				    System.exit(0);
					break;
				default:
				    System.out.println("Invalid choice!!!!");
			}
		}
	}
}