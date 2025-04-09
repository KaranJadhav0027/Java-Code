import java.util.*;
public class NA92
{
     public int sum;
     float multi;
     void addition(int a,int b)
     {
          sum=a+b;
          System.out.println(" Addition = "+sum);
     }
     void addition(int a,int b,int c)
     {
          sum=a+b+c;
          System.out.println(" Addition = "+sum);
     }
     void addition(float a,float b)
     {
         multi=a*b;
         System.out.println(" Multiplication = "+multi);
     }
     public static void main(String []args)
     {
         NA92 obj=new NA92();
         obj.addition(6,8);
         obj.addition(7,7,9);
         obj.addition(3.2f,8.9f);
     }
}