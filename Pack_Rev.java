package Nalini;
import java.util.*;
public class Pack_Rev
{
	public static void main(String []args)
	{
		int n,rem,rev=0;
		System.out.println("Enter any number : ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The reverse is "+rev);
	}
}