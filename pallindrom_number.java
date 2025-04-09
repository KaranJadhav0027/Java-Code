import java.io.*;
public class pallindrom_number
{
	public int num,rev,rem;
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
			rem=rem%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
			if(rev==num)
		
				System.out.println("\n Given Number is pallindrom Number");
			else
				System.out.println("\n Given Number not is pallindrom Number");
		
		
	}
	public static void main(String []args)throws IOException
	{
		pallindrom_number obj=new pallindrom_number();
		obj.input();
		obj.display();
	}
}
