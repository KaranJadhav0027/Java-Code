public class Para_const_this_sum
{
    int a,b,sum;
    public Para_const_this_sum()
    {
         a=89;
         b=54;
    }
    public Para_const_this_sum(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void display()
    {
         sum=a+b;
         System.out.println(" a = "+a);
         System.out.println(" b= "+b);
         System.out.println(" Sum = "+sum);
    }
    public static void main(String []args)
    {
         Para_const_this_sum obj1=new Para_const_this_sum();
         obj1.display();
         Para_const_this_sum obj2=new Para_const_this_sum(56,87);
         obj2.display();
    }
}