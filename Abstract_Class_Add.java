import java.util.*;
abstract class base
{
      int sum,multi;
      void addition(int a,int b)
      {
           sum=a+b;
           System.out.println(" a = "+a);
           System.out.println(" b = "+b);
           System.out.println(" Addition of two numbers = "+sum);
      }
      abstract void multiply(int a,int b);
}
public class Abstract_Class_Add extends base
{
      void multiply(int a,int b)
      {
            multi=a*b;
            System.out.println(" a = "+a);
            System.out.println(" b = "+b);
            System.out.println(" Multiplication of two numbers = "+multi);
      } 
      public static void main(String []args)
      {
           Abstract_Class_Add obj=new Abstract_Class_Add();
           obj.addition(3,4);
           obj.multiply(4,5);
      }
}