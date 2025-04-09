final class circle
{
     double pi=3.142,area;
     public void input(int r)
     {
          area=pi*r*r;
          System.out.println(" Radius = "+r);
          System.out.println(" Area of Circle = "+area);
     }
}
class triangle
{
     double area;
     public void display(int b,int h)
     {
          area=0.5*b*h;
          System.out.println(" Base = "+b);
          System.out.println(" Height= "+h);
          System.out.println(" Area of Triangle = "+area);
     }
}
public class Final_class_area
{
     public static void main(String []args)
     {
           circle C_obj=new circle();
           C_obj.input(7);
           triangle T_obj=new triangle();
           T_obj.display(7,8);
     }
}