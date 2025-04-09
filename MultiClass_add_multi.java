import java.io.*;
class add
{
    int a,b,sum;
    public void input()throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("  Enter any two numbers ");
         a=Integer.parseInt(br.readLine());
         b=Integer.parseInt(br.readLine());
    }    
    public void display()
    {
        sum=a+b;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);
        System.out.println("Sum = "+sum);
    }
}
class multi
{
    int a,b,multi;
    public void input()throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println(" Enter any two numbers ");
         a=Integer.parseInt(br.readLine());
         b=Integer.parseInt(br.readLine());
    }
    public void display()
    {
         multi=a*b;
         System.out.println(" a = "+a);
         System.out.println(" b = "+b);
         System.out.println(" Multiplication = "+multi);
    }
}
public class MultiClass_add_multi
{
      public static void main(String []args)throws IOException
      {
           add A_obj=new add();
           A_obj.input();
           A_obj.display();
           multi M_obj=new multi();
           M_obj.input();
           M_obj.display();
      }
}
