import java.io.*;
public class construct_fun_DigitSum
{
     int n,rem,sum;
     public construct_fun_DigitSum()
     {
          System.out.println("Comstructor is used ");
          n=786;
     }
     public void input()throws IOException
     {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter any number : ");
            n=Integer.parseInt(br.readLine());
     }
     public void display()
     { 
           System.out.println(" n = "+n);
           sum=0;
           while(n>0)
           {
                 rem=n%10;
                 sum=sum+rem;
                 n=n/10;
           }
           System.out.println(" Digit Sum = "+sum);
     }
     public static void main(String []args)throws IOException
     {
            construct_fun_DigitSum obj=new construct_fun_DigitSum();
            obj.display();
            obj.input();
            obj.display();
     }
}