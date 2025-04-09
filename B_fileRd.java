//program for reading data from console ny InpuStreamReader and BufferedReader
import java.io.*;
public class B_fileRd
{
	public static void main(String []args)throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		System.out.println("Enter your name : ");
		String name=br.readLine();
		System.out.println("Hello "+name);
	}
}