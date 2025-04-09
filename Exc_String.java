public class Exc_String
{
	public static void main(String []args)
	{
		String n=null;
		System.out.println("Before try");
		try
		{
			System.out.println("String = "+n.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("String having null value !");
		}
		finally
		{
			System.out.println("Final block is exected !!");
		}
	}
}