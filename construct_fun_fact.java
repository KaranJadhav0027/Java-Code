import java.io.*;
public class construct_fun_fact
{
     public int n,f;
     public construct_fun_fact()
     {
         System.out.println(" Constructor is used ");
         n=4;
     }
     public void input()throws IOException
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println(" Enter any number ");
          n=Integer.parseInt(br.readLine());
     }
    public void display()
    {
         System.out.println(" n = "+n);
         f=1;
         while(n>0)
         {
             f=f*n;
             n--;
         }
         System.out.println(" Factorial of number is : "+f);
    }
    public static void main(String []args)throws IOException
    {
          construct_fun_fact obj=new construct_fun_fact();
          obj.display();
          obj.input();
          obj.display();
    }
}