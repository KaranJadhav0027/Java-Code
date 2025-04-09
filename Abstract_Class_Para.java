import java.util.*;
abstract class base
{
     int r;
     final float pi=3.142f;
     float area;
     void input(int r)
     {
          this.r=r;
     }
     void output()
     {
         area=pi*r*r;
         System.out.println(" Radius = "+r);
         System.out.println(" Area of circle = "+area);
     }
}
public class Abstract_Class_Para extends base
{
      int length,width;
      float area;
      void getdata(int length,int width)
      {
           this.length=length;
           this.width=width;
      }
      void putdata()
      {
            area=length*width;
            System.out.println(" Length = "+length);
            System.out.println(" Width = "+width);
            System.out.println(" Area of Rectangle = "+area);
      }
      public static void main(String []args)
      {
             Abstract_Class_Para obj=new Abstract_Class_Para();
             obj.input(3);
             obj.getdata(4,6);
             obj.output();
             obj.putdata();
      }
}