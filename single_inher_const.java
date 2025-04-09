class base
{
      int a,b,sum;
      base()
      {
          System.out.println(" Base class Constructor is used ");
          a=67;
          b=5;
      }
      void addition()
      {
           sum=a+b;
           System.out.println(" a = "+a);
           System.out.println(" b = "+b);
           System.out.println(" Addition = "+sum);
      }
}
public class single_inher_const extends base
{
       int a,b,sub;
       single_inher_const()
       {
             System.out.println(" Deriverd class constructor is used ");
             a=34;
             b=4;
       }
       void subtract()
       {
            sub=a-b;
            System.out.println(" a = "+a);
            System.out.println(" b = "+b);
            System.out.println(" Subtraction = "+sub);
       }
       public static void main(String []args)
       {
             single_inher_const obj=new single_inher_const();
             obj.addition();
             obj.subtract();
       }
}