class Area
{
    float pi=3.142f,area;
    final void display(float r)
    {
          System.out.println(" Final Method is in use first class r = "+r);
    }
}
public class NA96 extends Area
{
    void display(float r)
    {
        area=pi*r*r;
        System.out.println("Radius = "+r);
        System.out.println(" Area = "+area);
    }
    public static void main(String []args)
    {
         NA96 obj=new NA96();
         obj.display(6.8f);
    }
}