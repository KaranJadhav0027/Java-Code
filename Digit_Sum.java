import java.io.*;
public class Digit_Sum
{
	public int num,sum=0,rem;
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
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Digit Sum="+sum);
	}
	public static void main(String []args)throws IOException
	{
		Digit_Sum obj=new Digit_Sum();
		obj.input();
		obj.display();
	}
}
