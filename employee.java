import java.util.*;
import java.io.*;
public class employee
{
	public static void main(String []args)throws IOException
	{
		int eid;
		String ename="";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Hashtable hs=new Hashtable();
		System.out.println("Enter number of employee : ");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter employee id and name : ");
			eid=Integer.parseInt(br.readLine());
			ename=br.readLine();
			hs.put(eid,ename);
		}
		Enumeration v=hs.elements();
		Enumeration k=hs.keys();
		System.out.println("Name  ID ");
		while(k.hasMoreElements())
		{
			System.out.println(v.nextElement()+" "+k.nextElement());
		}
	}
}