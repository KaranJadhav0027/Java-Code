import java.util.*;
class base
{
       int a,b,sum;
       base()
       {
           System.out.println(" Base class constructor is used ");
           a=56;
           b=5;
       }
       void display()
       {
            sum=a+b;
            System.out.println(" a = "+a);
            System.out.println(" b = "+b);
            System.out.println(" Addition = "+sum);  
       }
}
public class inher_super_add extends base
{
       int a,b,multi;
       inher_super_add()
       {
            System.out.println(" Derived class constructor is used ");
            a=5;
            b=7;
       }
       void display()
       {
            super.display();
            multi=a*b;
            System.out.println(" a = "+a);
            System.out.println(" b = "+b);
            System.out.println(" Multiplication = "+multi);
       }
       public static void main(String []args)
       {
           inher_super_add obj=new inher_super_add();
           obj.display();
       }
}
