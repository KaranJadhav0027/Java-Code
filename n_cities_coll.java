/* Program to read n cities names from user store them into ArrayList, the program should not allow
duplicate city and display it in ascending order */

import java.util.*;
import java.io.*;
public class n_cities_coll
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList a=new ArrayList();
		System.out.println("How many cities?");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter city name: ");
		for(int i=1;i<=n;i++)
		{
			a.add(br.readLine());
		}
		TreeSet tr=new TreeSet(a);
		System.out.println("Sorted city names are : "+tr);
	}
}