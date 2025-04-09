import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1
{
	public static void main(String []args)
	{
		ArrayList<String> a1=new ArrayList(20);
		for(int i=0;i<20;i++)
		{
			a1.add(" "+i);
		}
		for(int i=0;i<20;i++)
		{
			System.out.println(" "+a1.get(i));
		}
	}
}