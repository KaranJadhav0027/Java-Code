import java.util.ArrayList;
import java.util.HashSet;
public class ArrayList_HashSet_noDuplic
{
	public static void main(String []args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Monday");
		a1.add("Tuesday");
		a1.add("Wednesday");
		a1.add("Thursday");
		a1.add("Friday");
		a1.add("Saturday");
		a1.add("Sunday");
		a1.add("Tuesday");
		System.out.println("Original elements order : ");
		System.out.println(a1);
		HashSet<String> hset=new HashSet<String>();
		hset.addAll(a1);
		System.out.println("Unordered HashSet elements without duplication : ");
		System.out.println(hset);
	}
}