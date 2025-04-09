import java.util.*;
public class ArrayList_Int
{
	public static void main(String []args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(6);
		list.add(8);
		System.out.println("Employee nos.:");
		for(int empno:list)
		{
			System.out.println(empno);
		}
	}
}