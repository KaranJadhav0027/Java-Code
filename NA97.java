interface shape
{
    int add(int a,int b);
    int multiply(int a,int b);
}
public class NA97 implements shape
{
    public int add(int a,int b)
    {
          return(a+b);
    }
    public int multiply(int a,int b)
    {
       return a*b;
    }
    public static void main(String []args)
    {
         NA97 obj=new NA97();
         System.out.println(" Sum = "+obj.add(6,8));
         System.out.println(" Multiplication = "+obj.multiply(6,9));
    }
}