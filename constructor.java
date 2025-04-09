public class constructor
{
     public int n;
     public constructor()
     {
           n=100;
     }
     public void display()
     {
          System.out.println(" n = "+n);
     }
     public static void main(String []args)
     {
           constructor obj=new constructor();
           obj.display();
     }
}