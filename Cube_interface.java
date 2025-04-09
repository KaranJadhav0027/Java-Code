import java.io.*;
interface cube
{
	public void print(int n);
}
class Cube_interface
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number to find cube :");
		int n=Integer.parseInt(br.readLine());
		cube p=n1->System.out.println("Cube  : "+(n*n*n));
		p.print(n);
	}
}