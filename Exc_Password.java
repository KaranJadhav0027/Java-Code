import java.io.*;
class Exc_pass extends Exception
{
	Exc_pass(String msg)
	{
		super(msg);
	}
}
public class Exc_Password
{
	public static void main(String []args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter Password : ");
			if(br.readLine().equals("PARAM"))
			{
				System.out.println("Successfully Authenticated !!");
			}
			else
			{
				throw (new Exc_pass("Authentication Failure -----"));
			}
		}
		catch(Exc_pass e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println("Wrong Password !!");
		}
	}
}