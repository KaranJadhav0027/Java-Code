/* Accept n integers from the user. Store and display integers in sorted order having proper collection class .
The collection should not accept duplicate elements */

import java.util.*;
import java.io.*;
class Coll_noDuplic
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set s=new TreeSet();
		System.out.println("Enter no of integers : ");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number ");
			int x=Integer.parseInt(br.readLine());
			s.add(x);
		}
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Enter element to be searched : ");
		int no=Integer.parseInt(br.readLine());
		if(s.contains(no))
		{
			System.out.println("Number "+no+" found");
		}
		else
		{
			System.out.println("Number "+no+" not found ");
		}
	}
}