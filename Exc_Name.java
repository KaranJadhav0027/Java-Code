//Slip6_2
import java.io.*;
class InvalidNameException extends Exception
{
}
public class Exc_Name
{
	public static void main(String []args)throws IOException
	{
		int ch,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name : ");
		String name=br.readLine();
		try
		{
			for(i=0;i<a.length;i++)
			{
			ch=(int)name.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				System.out.println("Name is valid !!!");
			}
			else
			{
				throw new InvalidNameException();
			}
			}
		}
		catch(InvalidNameException e)
		{
			System.out.println("Invalid name!!!");
		}
	}
}