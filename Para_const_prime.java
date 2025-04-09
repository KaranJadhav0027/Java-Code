public class Para_const_prime
{
      public int a,n,rem,p;
      public Para_const_prime()
      {
           System.out.println(" Constructor is used ");
           n=19;
      }
      public Para_const_prime(int b)
      {
           n=b;
      }
      public void display()
      {
           System.out.println(" n = "+n);
           p=1;
           for(a=2;a<n;a++)
           {
               if(n%a==0)
                  p=0;
           }
           if(p==1)
                System.out.println(" Prime Number ");
           else
                System.out.println(" Not Prime Number ");
      }
      public static void main(String []args)
      {
            Para_const_prime obj1 = new Para_const_prime();
            obj1.display();
            Para_const_prime obj2 = new Para_const_prime(765);
            obj2.display();
      }
}