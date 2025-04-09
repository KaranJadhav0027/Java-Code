import java.io.*;
class Exc_Per
{
	public static void main(String []args)
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Percentage : ");
			double per=Double.parseDouble(br.readLine());
			if(!(per>=0 && per<=100))
			{
				throw new Exception("Invalid Percentage---------"+per);
			}
			else
			{
				System.out.println("Valid Percentage !!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}