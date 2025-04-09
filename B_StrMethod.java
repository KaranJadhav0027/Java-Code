//program for String methods
import java.lang.*;
import java.util.Scanner;
public class B_StrMethod
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		String s1="password****";
		String s2;
		System.out.println("Enter the password : ");
		s2=scan.next();
		if(s1.compareTo(s2)==0)
		{
			System.out.println("correct password!!");
		}
		else
		{
			System.out.println("Incorrect Passowrd !!");
			System.exit(0);
		}
		String s="Welcome to java";
		StringBuffer str=new StringBuffer(s);
		str.append(s1);
		System.out.println("Appended = "+str);
		StringBuffer str1=new StringBuffer(s1);
	    str1=str1.reverse();
        System.out.println("String in reverse order is : "+str1);
        System.out.println("Replaced '*' with '$' = "+s1.replace('*','$'));		
	}
}