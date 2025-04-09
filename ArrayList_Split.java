import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ArrayList_Split
{
	public static void main(String []args)
	{
		String str="The String to ArrayList Program";
		String strArray[]=str.split(" ");
		System.out.println("The input String : "+str);
		List<String> strlist=new ArrayList<String>();
		strlist=Arrays.asList(strArray);
		System.out.println("\n The ArrayList from String : "+strlist);
	}
}