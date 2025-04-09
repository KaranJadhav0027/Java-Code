public class Str_to_Float
{
   public static void main(String []args)
   {
	   String s="4.5";
	   Float obj=Float.valueOf(s);
	   float n=obj.floatValue();
	   System.out.println(" n = "+n);
   }
}