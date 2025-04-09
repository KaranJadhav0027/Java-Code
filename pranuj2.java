import java.util.List;
import java.util.Arrays;

public class pranuj2
{
	public static void main(String args[])
	{
		String str="The string to array list program";
		String strArray[]=str.split(" ");
		System.out.println("The input string :"+str);
		List<String> strList=new ArrayList<String>();
		strList=Arrays.asList(strArray);
		System.out.println("\nThe Array list from string :"+strList);
	}
}