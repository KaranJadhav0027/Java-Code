import java.io.*;
class Exc_ArrayBound
{
	public static void main(String []args)
	{
		try
		{
			int a[]={2,3,4,5,6,7};
			System.out.println("Array Elements : "+a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
	    {
			System.out.println("\n "+e);
		}
	}
}