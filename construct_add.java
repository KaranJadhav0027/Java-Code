public class construct_add
{
     public int a,b,sum;
     public construct_add()
     {
          a=90;
          b=56;
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
            construct_add obj=new construct_add();
            obj.display();
     }
}