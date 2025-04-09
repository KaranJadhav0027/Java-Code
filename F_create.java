//using file handling create a new file 
import java.io.File;
import java.io.IOException;
public class F_create
{
	public static void main(String []args)
	{
		try
		{
			File obj=new File("Nalini.txt");
			if(obj.createNewFile())
			{
				System.out.println("File created : "+obj.getName());
			}
			else
			{
				System.out.println("File already exists !!");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured ");
			e.printStackTrace();
		}
	}
}