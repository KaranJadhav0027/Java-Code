import java.util.ArrayList;
import java.util.*;
public class ArrayList_Remove
{
	public static void main(String []args)
	{
		ArrayList<String> nm=new ArrayList<String>();
		nm.add("Nalini");
		nm.add("Mamta");
		nm.add("Pranoti");
		nm.add("Pooja");
		nm.add("Gayatri");
		nm.remove(3);
		System.out.println(nm);
	}
}