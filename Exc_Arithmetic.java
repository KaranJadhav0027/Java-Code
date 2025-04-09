import java.util.*;
public class Exc_Arithmetic
{
    public static void main(String []args)
	{
		int a,b,div;
		try
		{
			a=20;
			b=0;
			div=a/b;
			System.out.println("Division = "+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Zero can not be divide any value !!");
		}
	}
}