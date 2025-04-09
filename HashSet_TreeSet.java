import java.util.*;
public class HashSet_TreeSet
{
	public static void main(String []args)
	{
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Nalini");
		h_set.add("Mamta");
		h_set.add("Pranoti");
		h_set.add("Pooja");
		System.out.println("Original hashset is : "+h_set);
		Set<String> tree_set=new TreeSet<String>(h_set);
		System.out.println("TreeSet elements is : ");
		for(String element : tree_set)
		{
			System.out.println(element);
		}
	}
}