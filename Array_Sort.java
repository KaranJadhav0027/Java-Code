import java.util.*;
public class Array_Sort
{
	public static void main(String []args)
	{
		int[] a=new int[]{9,3,7,8};
		System.out.println("Original Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		Arrays.sort(a);
		System.out.println("Sorted Array : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		int[] b=new int[]{3,6,7,9};
		Arrays.sort(b,1,4);
		System.out.println("Patially Sorted int array is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+b[i]);
		}
	}
}