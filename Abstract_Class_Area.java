import java.util.*;
abstract class base
{
      int r;
      final float pi=3.142f;
      float carea;
      void getdata()
      {
           System.out.println(" Enter the radius of the circle ");
           Scanner scan=new Scanner(System.in);
           r=scan.nextInt();
      }
      void putdata()
      {
           carea=pi*r*r;
           System.out.println(" Radius = "+r);
           System.out.println(" Area of circle = "+carea);
      }
}
public class Abstract_Class_Area extends base
{
      int length,width;
      float rarea;
      void input()
      {
           System.out.println(" Enter the length and width of the reactangle ");
           Scanner scan=new Scanner(System.in);
           length=scan.nextInt();
           width=scan.nextInt();
      }
      void output()
      {
           rarea=length*width;
           System.out.println(" length = "+length);
           System.out.println(" width = "+width);
           System.out.println(" Area of Rectangle = "+rarea);
      }
      public static void main(String []args)
      {
           Abstract_Class_Area obj=new Abstract_Class_Area();
           obj.getdata();
           obj.input();
           obj.putdata();
           obj.output();
      }
}
