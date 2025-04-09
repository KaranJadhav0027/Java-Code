public class Para_this_firstLast
{
    public int n,rem1,rem2,sum=0;
    public void input(int n)
    {
          this.n=n;
    }
    public void display()
    {
         System.out.println(" n ="+n);
         rem1=n%10;
         while(n>0)
         {
              rem2=n%10;
              n=n/10;
         }
         sum=rem1+rem2;
         System.out.println(" Sum of First & last Digit = "+sum);
    }   
    public static void main(String []args)
    {
         Para_this_firstLast obj=new Para_this_firstLast();
         obj.input(765);
         obj.display();
    }
}