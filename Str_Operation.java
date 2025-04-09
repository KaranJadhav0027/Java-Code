class constring
{
	String s1="Param";
	String s2="param";
	public void con_display()
	{
		String s3=s1.concat(s2);
		System.out.println(s3);
	}
}
class Str_cmp
{
	String s1="Param";
	String s2="param";
	public void cmp_display()
	{
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}
}
public class Str_Operation
{
	public static void main(String []args)
	{
		constring obj1=new constring();
		obj1.con_display();
		Str_cmp obj2=new Str_cmp();
		obj2.cmp_display();
	}
}