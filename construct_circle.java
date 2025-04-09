public class construct_circle
{
     public int r;
     public double area,pi;
     public construct_circle()
     {
          pi=3.142;
          r=5;
     }
     public void display()
     {
            area=pi*r*r;
            System.out.println(" Radius = "+r);
            System.out.println(" Area = "+area);
     }
     public static void main(String []args)
     {
            construct_circle obj=new construct_circle();
            obj.display();
     }
}