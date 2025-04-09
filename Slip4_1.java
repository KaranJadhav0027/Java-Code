//Slip4_1
/*Q1) Write a program to print an array after changing the rows and columns of a given 
 two-dimensional array.*/
 
import java.util.Scanner;
public class Slip4_1
{
	public static void main(String []args)
	{
		int a[][]=
		{
			{10,20,30},{40,50,60}
		};
		System.out.print("Original array : \n");
		print_array(a);
		System.out.print("After changing rows and columns : \n");
		transpose(a);
	}
	private static void transpose(int a[][])
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