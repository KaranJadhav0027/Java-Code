import java.io.*;
class Negative extends Exception
{
	Negative(String msg)
	{
		super(msg);
	}
} 
public class Exc_Age
{
	public static void main(String []args)throws IOException
	{
		int age=0;
		String name;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter age and name of the person : ");
		try
		{
			age=Integer.parseInt(br.readLine());
			name=br.readLine();
			if(age<0)
               throw new Negative("Age is negative ");			   
			else
			   throw new Negative("Age is positive ");
		}
		catch(Negative n)
		{
			System.out.println("Hello "+n);
		}
		catch(Exception e)
		{
			System.out.println("BYE "+e);
		}
	}
}