import java.util.*;
public class ArrayList_Reverse
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit of ArrayList : ");
		int range=sc.nextInt();
		ArrayList alist=new ArrayList();
		System.out.println("\n Enter elemnets of ArrayList : ");
		for(int i=0;i<range;i++)
		{
			String n=sc.next();
			alist.add(n);
		}
		System.out.println("Original Arraylist is  : "+alist);
		Collections.reverse(alist);
		System.out.println("Reverse of ArrayList is : "+alist);
	}
}