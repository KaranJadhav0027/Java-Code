import java.util.*;
public class Exc_Number
{
	public static void main(String []args)
	{
		int n;
		try
		{
			System.out.println("Enter any number : ");
			Scanner scan=new Scanner(System.in);
			n=scan.nextInt();
			System.out.println(" n = "+n);
		}
		catch(InputMismatchException e)
		{
			System.out.println(" Only Integer values(without fraction) area allowed !!!");
		}
	}
}