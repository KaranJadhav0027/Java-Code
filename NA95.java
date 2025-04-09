import java.util.*;
class Number
{
    public int sum;
    float add;
    void addition(int a,int b)
    {
         sum=a+b;
         System.out.println("Addition = "+sum);
    }
    void final addition(int a,float b)
    {
         add=a+b;
         System.out.println(" Addition = "+add);
    }
}
public class NA95
{
    public static void main(String []args)
    {
         Number obj=new Number();
         obj.addition(7,9);
         obj.addition(6,8.8f);
    }
}