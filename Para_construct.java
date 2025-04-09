public class Para_construct
{
   public int n,rem,sum;
   public Para_construct()
   {
        System.out.println(" Constructor is used ");
        n=564;
   }
   public Para_construct(int a)
   {
         n=a;
   }
   public void display()
   { 
        System.out.println(" n= "+n);
        sum=0;
        while(n>0)
        {
             rem=n%10;
             sum=sum+rem;
             n=n/10;
        }
        System.out.println(" Digit sum = "+sum);
   }
   public static void main(String []args)
   {
        Para_construct obj1=new Para_construct();
        obj1.display();
        Para_construct obj2=new Para_construct(7654);
        obj2.display();
   }
}