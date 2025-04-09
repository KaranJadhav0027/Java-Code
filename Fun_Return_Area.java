import java.util.*;
class Fun_Return_Area
{
      float display(int r)
      {
            return(3.142f*r*r);
      }
      public static void main(String []args)
      {
           Fun_Return_Area obj=new Fun_Return_Area();
           System.out.println(" Area of circle = "+obj.display(4));
      }
}