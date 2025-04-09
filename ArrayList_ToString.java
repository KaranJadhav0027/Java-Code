import java.util.ArrayList;
public class ArrayList_ToString
{
	public static void main(String []args)
	{
		ArrayList<String> strlist=new ArrayList<String>();
		strlist.add("This");
		strlist.add("is");
		strlist.add("my");
		strlist.add("computer");
		System.out.println("The arraylist : "+strlist);
		StringBuffer sb=new StringBuffer();
		for(String str:strlist)
		{
			sb.append(str+" ");
		}
		String mystr=sb.toString();
		System.out.println("\n String from ArrayList: "+mystr);
		System.out.println("String Length : "+mystr.length());
	}
}