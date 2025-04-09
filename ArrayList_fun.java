import java.util.HashSet;
public class ArrayList_fun
{
	public static void main(String []args)
	{
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(45);
		hset.add(23);
		hset.add(78);
		hset.add(54);
		hset.add(87);
		System.out.println("Initial list of elements : ");
		System.out.println(hset);
		hset.remove(45);
		System.out.println("List of elements after removing 45 ");
		System.out.println(hset);
		HashSet<Integer> hset2=new HashSet<Integer>();
		hset2.add(22);
		hset2.add(82);
		hset.addAll(hset2);
		System.out.println("List of elements after adding elements ");
		System.out.println(hset);
		hset.removeAll(hset2);
		System.out.println("List of elements after removing elements from hset2");
		System.out.println(hset);
		hset.clear();
		System.out.println("After invoking clear() method : "+hset);
	}
}