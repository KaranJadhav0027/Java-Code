import java.io.*;
public class Factorial_number
{
	public int num,fact=1;
	public void input()throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("\nEnter Any Number");
		num=Integer.parseInt(d.readLine());
	}
	public void display()
	{
		while(num>0)
		{
			fact=fact*num;
			num=num-1;
		}
		System.out.println("Factorial number="+fact);
	}
	public static void main(String []args)throws IOException
	{
		Factorial_number obj=new Factorial_number();
		obj.input();
		obj.display();
	}
}
