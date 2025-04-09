import java.io.*;
public class construct_fun_rev
{
     public int rev,rem,n;
     public construct_fun_rev()
     {
            System.out.println(" Constructor is used ");
            n=675;
     }
     public void input()throws IOException
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println(" Enter any number ");
          n=Integer.parseInt(br.readLine());
     }
     public void display()
     {
           System.out.println(" n= "+n);
           rev=0;
           while(n>0)
           {
                   rem=n%10;
                   rev=rev*10+rem;
                   n=n/10;
           } 
           System.out.println(" Reversed number is : "+rev);
     }
     public static void main(String []args)throws IOException
     {
            construct_fun_rev obj=new construct_fun_rev();
            obj.display();
            obj.input();
            obj.display();
     }
}