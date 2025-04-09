import java.util.*;
class base
{
     public int sum;
     float add;
     void addition(int a,int b)
     {
          sum=a+b;
          System.out.println(" Addition = "+sum);
     }
     void addition(int a,float b)
     {
          add=a+b;
          System.out.println(" Addition = "+add);
     }
}
public class NA94
{
    public static void main(String []args)
    {
         base obj=new base();
         obj.addition(6,8);
         obj.addition(3,7.8f);
    }
}
