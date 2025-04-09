final class add
{
      int sum;
      public void addition(int a,int b)
      {
            sum=a+b;
            System.out.println(" a = "+a);
            System.out.println(" b = "+b);
            System.out.println(" Sum = "+sum);
      }
}
class number
{
      int multi;
      public void multiply(int a,int b)
      {
            multi=a*b;
            System.out.println(" a = "+a);
            System.out.println(" b = "+b);
            System.out.println(" Multiplication = "+multi);
      }
}
public class Final_class
{
      public static void main(String []args)
      {
            add A_obj=new add();
            A_obj.addition(67,87);
            number N_obj=new number();
            N_obj.multiply(6,8);
      }
}