import java.util.*;
import java.util.Iterator;
public class ArrayList_HashSet
{
	public static void main(String []args)
	{
		HashSet<String> h_set=new HashSet<String>();
		h_set.add("Nalini");
		h_set.add("Pranoti");
		h_set.add("Mamta");
		Iterator<String> p=h_set.iterator();
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
	}
}