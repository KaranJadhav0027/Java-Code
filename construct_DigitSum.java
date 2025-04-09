public class construct_DigitSum
{
     int n,rem,sum;
     public construct_DigitSum()
     {
          System.out.println(" Constructor is used ");
          sum=0;
          n=765;
     }
     public void display()
     {
          System.out.println(" Number = "+n);
          while(n>0)
          {
               rem=n%10;
               sum=sum+rem;
               n=n/10;
          }
          System.out.println(" Digit  sum = "+sum);
     }
     public static void main(String []args)
     {
          construct_DigitSum obj=new construct_DigitSum();
          obj.display();
     }
}