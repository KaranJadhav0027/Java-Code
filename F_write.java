import java.util.Scanner;
import java.io.*;
public class F_write
{
	public static void main(String []args)throws IOException
	{
		String F1,content;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the file name : ");
		F1=scan.nextLine();
		try
		{
			FileWriter fw=new FileWriter(F1);
			System.out.print("Enter the file content : ");
			content=scan.nextLine();
			fw.write(content);
			fw.close();
			System.out.println("Content written to the file successfully !!");
		}
		catch(IOException e)
		{
			System.out.println("\nException : "+e);
		}
	}
}