package Nalini;
import java.util.*;
public class Pack_Even_Odd
{
	public static void main(String []args)
	{
		int n;
		System.out.println("Enter any number : ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n%2==0)
			System.out.println(n+" is even number ");
		else
			System.out.println(n+" is odd number ");
	}
}