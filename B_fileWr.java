//program for write the string into file using FileWriter
import java.io.*;
public class B_fileWr
{
	public static void main(String []args)
	{
		try
		{
			Writer w=new FileWriter("A.txt");
			String s="Covid vaccine";
			w.write(s);
			w.close();
			System.out.println("Successfully written!!!");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}