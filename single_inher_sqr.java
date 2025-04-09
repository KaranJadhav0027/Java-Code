import java.util.*;
class base
{
     int z;
     void sqr(int x)
     {
         z=x*x;
         System.out.println(" Square of  "+x+" is "+z);
     }
}
public class single_inher_sqr extends base
{
     void cube(int y)
     {
         z=y*y*y;
         System.out.println(" Cube of  "+y+" is "+z);
     }
     public static void main(String []args)
     {
           single_inher_sqr obj=new single_inher_sqr();
           obj.sqr(2);
           obj.cube(3);
     }
}