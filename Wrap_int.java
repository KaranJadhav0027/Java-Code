import java.util.*;
class Wrap_int
{
	public static void main(String []args)
	{
		int a=10;
		float b=23.4f;
		double n=673.36;
		Integer int_obj=new Integer(a);
		Float float_obj=new Float(b);
		Double dob_obj=new Double(n);
		System.out.println("Value of Integer object = "+int_obj);
		System.out.println("Value of Float object = "+float_obj);
		System.out.println("Value of Double object = "+dob_obj);
		int x=int_obj;
		float y=float_obj;
		double z=dob_obj;
		System.out.println("Value as an Int primitive type = "+x);
		System.out.println("Value as an Float primitive type = "+y);
		System.out.println("Value as an Double primitive type = "+z);
	}
}