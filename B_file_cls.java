//program for file class
import java.io.*;
public class B_file_cls
{
	public static void main(String []args)
	{
		try
		{
			File f=new File("N.txt");
			if(f.createNewFile())
			{
				System.out.println("File created : "+f.getName());
			}
			else
			{
				System.out.println("File already exists !!");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured !");
			e.printStackTrace();
		}
	}
}