/*Program to accept n employee from user, store them into the linked list class and display them by using 
ListIterator interface and iterator interface*/
import java.util.*;
import java.io.*;
public class n_employee_linklist_coll
{
	public static void main(String []args)throws Exception
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		LinkedList li=new LinkedList();
		System.out.println("\n Enter number of employee : ");
		n=Integer.parseInt(br.readLine());
		System.out.println("\n Enter name : ");
		for(int i=1;i<=n;i++)
		{
			li.add(br.readLine());
		}
		System.out.println("\nLink List Content : ");
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("\nReverse order : ");
		ListIterator It=li.listIterator();
		while(It.hasNext())
		{
			It.next();
		}
		while(It.hasPrevious())
		{
			System.out.println(It.previous());
		}
	}
}