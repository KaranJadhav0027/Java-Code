//program for file class with readable and writable
import java.io.*;
public class B_file_rdwr
{
	public static void main(String []args)
	{
		File f=new File("A.txt");
		if(f.exists())
		{
			System.out.println("File Name : "+f.getName());
			System.out.println("Absolute path : "+f.getAbsolutePath());
			System.out.println("Writable : "+f.canWrite());
			System.out.println("Readable : "+f.canRead());
			System.out.println("File Size in bytes : "+f.length());
		}
		else
		{
			System.out.println("Sorry!!! The file does not exists!!");
		}
	}
}