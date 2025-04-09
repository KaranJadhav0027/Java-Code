//program for prime numbers between 1 to 20 using throws or between 1 to n
import java.util.Scanner;
import java.io.*;
class B_Prime_throws
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int i=0;
		int n1=0;
		//System.out.println("Enter the limit : ");
		//int lim=scan.nextInt();
		System.out.println("Prime numbers from 1 to 20 are : ");
		for(i=1;i<=20;i++)
		{
			int cnt=0;
			for(n1=i;n1>=1;n1--)
			{
				if(i%n1==0)
				{
					cnt=cnt+1;
				}
			}
			if(cnt==2)
			{
				System.out.println(" "+i);
			}
		}
	}
}