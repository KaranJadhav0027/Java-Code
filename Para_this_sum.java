public class Para_this_sum
{
     int a,b,sum;
     public void input(int a,int b)
     {
            this.a=a;
            this.b=b;
     } 
     public void display()
     {
         sum=a+b;
         System.out.println(" a = "+a);
         System.out.println(" b = "+b);
         System.out.println(" Sum = "+sum);
     }
     public static void main(String []args)
     {
          Para_this_sum obj=new Para_this_sum();
          obj.input(67,78);
          obj.display();
     }
}