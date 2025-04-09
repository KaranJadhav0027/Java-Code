import java.io.*;
public class Para_even_odd
{
    public int n,i,rem;
    public void getdata()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Enter any number ");
        n=Integer.parseInt(br.readLine());
    }
    public void input(int x)
    {
        n=x;
    }
    public void display()
    {
         int esum=0,osum=0;
         while(n>0)
         {
             rem=n%10;
             if(rem%2==0)
             {
                 esum=esum+rem;
             }
             else
             {
                 osum=osum+rem;
             }
             n=n/10;
         }
         System.out.println("Even digit sum = "+esum);
         System.out.println("Odd digit sum = "+osum);
    }
    public static void main(String []args)throws IOException
    {
          Para_even_odd obj=new Para_even_odd();
          obj.getdata();
          obj.display();
          System.out.println(" even and odd digit sum of 8965 is ");
          obj.input(8965);
          obj.display();        
    }
}