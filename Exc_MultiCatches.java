import java.util.*;
public class Exc_MultiCatches
{
	public static void main(String []args)
	{
		int a,b,div;
		try
		{
			System.out.println("Enter any two numbers : ");
			Scanner scan=new Scanner(System.in);
			a=scan.nextInt();
			b=scan.nextInt();
			div=a/b;
			System.out.println("Division = "+div);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Zero can not be divide any value ! ");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Only integer values are allowed !");
		}
	}
}