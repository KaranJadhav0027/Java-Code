import java.io.*;
public class Array_rev
{
	public static void main(String []args)throws IOException
	{
		int a[]=new int[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 10 array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Array elements in reverse order :");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}