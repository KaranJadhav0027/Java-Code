import java.util.*;
public class ArrayElement
{
  public int a[]=new int[10];
  public int i;
  
  void input()
  {
	  System.out.println("\tEnter 10 Array Elememts");
	  Scanner scan=new Scanner(System.in);
	  for(i=0;i<a.length;i++)
	  {
		  a[i]=scan.nextInt();
	  }
	  System.out.println("Array Elements are\n");
	  for(i=0;i<a.length;i++)
	  {
		  System.out.println("\n"+a[i]);
	  }
  }
  public static void main(String []args)
	{
		ArrayElement obj=new ArrayElement();
		obj.input();
	}
  }