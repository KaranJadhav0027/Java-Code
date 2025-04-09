//program for throw keyword
import java.util.Scanner;
public class B_throw
{
	static void checkAge(int Age)
	{
		if(Age<18)
		{
			throw new ArithmeticException("No covid vaccine - you must be at least 18 years old ");
		}
		else
		{
			System.out.println("Covid vaccine is granted !!!");
		}
	}
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the person age : ");
		int Age=scan.nextInt();
		checkAge(Age);
	}
}