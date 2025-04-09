public class Para_this_fact
{
     public int f=1,n;
     public void input(int n)
     {
           this.n=n;
     }
     public void display()
     {
           System.out.println(" n = "+n);
           while(n>0)
           {
                f=f*n;
                n--;
           }
           System.out.println(" Factorial of number = "+f);
     }
     public static void main(String []args)
     {
          Para_this_fact obj=new Para_this_fact();
          obj.input(5);
          obj.display();
     }
}