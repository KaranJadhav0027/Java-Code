import java.util.Scanner;
import java.util.TreeSet;
public class ArrayList_TreeSet
{
	public static void main(String []args)
	{
		TreeSet<String> ts=new TreeSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element TreeSet collection : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String dt=sc.next();
			ts.add(dt);
		}
		System.out.println("Element of treeset are : ");
		System.out.println(ts);
	}
}