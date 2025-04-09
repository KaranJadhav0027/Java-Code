import java.util.*;
public class ArrayList_StrList
{
	public static void main(String []args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Nalini");
		list.add("Mamta");
		list.add("Pranoti");
		list.add("120");
		list.add("Pooja");
		System.out.println("Employee list: ");
		for(String empName:list)
		{
			System.out.println(empName);
		}
	}
}