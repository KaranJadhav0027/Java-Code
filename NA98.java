interface shape
{
    final float pi=3.142f;
    float area(float r);
    float circum(float r);
}
class Area_shape implements shape
{
    public float area(float r)
    {
         return(pi*r*r);
    }
    public float circum(float r)
    {
        return(2*pi*r);
    }
}
public class NA98
{
      public static void main(String []args)
      {
           Area_shape obj=new Area_shape();
           System.out.println(" Area = "+obj.area(1));
           System.out.println(" Circumference = "+obj.circum(1));
      }   
}