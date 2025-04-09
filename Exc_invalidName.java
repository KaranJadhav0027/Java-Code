import java.util.*;

class InvalidNameException extends Exception
{}

class Exc_invalidName
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Name ");
		String name=s.next();
		try
		{
			for(int i=0;i<name.length();i++)
			{
				int ch=(int)name.charAt(i);
				if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
				{}
				else
				{
					throw new InvalidNameException();
				}
			}
			System.out.println("Employee Name is :"+name);
		}
		catch(InvalidNameException e)
		{
			System.out.println("Invalid user Name ");
		}
	}
}