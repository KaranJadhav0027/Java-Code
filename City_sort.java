import java.io.*;
class City_sort
{
	public static void main(String []args)throws IOException
	{
		String temp;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many cities do you want to enter ?");
		int n=Integer.parseInt(br.readLine());
		String names[]=new String[n];
		System.out.println("Enter city names :");
		for(int i=0;i<n;i++)
		{
			System.out.print("City "+(i+1)+":");
			names[i]=br.readLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(names[j-1].compareTo(names[j])>0)
				{
					temp=names[j-1];
					names[j-1]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println("Cities in sorted order : ");
		for(int i=0;i<n;i++)
			System.out.println(names[i]);
	}
}