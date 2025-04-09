import java.io.*;
import java.io.File;
import java.io.FileReader;
public class cnt_lines
{
	public static void main(String []args)throws IOException
	{
		String line;
		int cntw=0,cntl=0;
		String File=args[0];
		FileReader file=new FileReader(File);
		BufferedReader br=new BufferedReader(file);
		while((line=br.readLine())!=null)
		{
			String ln[]=line.split("\n");
			String wrds[]=line.split(" ");
			cntw=cntw+wrds.length;
			cntl=cntl+ln.length;
		}
		System.out.println("Nulmer of lines = "+cntl);
		System.out.println("Number of words = "+cntw);
		br.close();
	}
}