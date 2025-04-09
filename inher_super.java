import java.util.*;
class base
{
     int n;
     base()
     {
          System.out.println(" Base Class constuctor is used ");
     }
     void display()
     {
           n=10;
           System.out.println(" Base Class n = "+n);
     }
}
public class inher_super extends base
{
      int n;
      inher_super()
      {
           System.out.println(" Derived Class constructor is used ");
      }
      void show()
      {
           super.display();
      }
      void display()
      {
           n=12;
           System.out.println(" Derived class n = "+n);
           System.out.println(" Good Morning all ");
      }
      public static void main(String []args)
      {
           inher_super obj=new inher_super();
           obj.show();
           obj.display();
      }
}