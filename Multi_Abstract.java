import java.util.*;
abstract class base
{
    int sum,multi;
    abstract void addition(int a,int b);
    abstract void multiply(int a,int b);
}
public class Multi_Abstract extends base
{
     void addition(int a,int b)
     {
          sum=a+b;
          System.out.println(" Addition = "+sum);
     }
     void multiply(int a,int b)
     {
          multi=a*b;
          System.out.println(" Multiplication = "+multi);
     }
     public static void main(String []args)
     {
           Multi_Abstract obj=new Multi_Abstract();
           obj.addition(6,8);
           obj.multiply(6,5);
     }
}