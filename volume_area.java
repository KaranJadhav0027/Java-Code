  interface operation
  {
	  final double pi=3.142;
	  double area(double r,double h);
	  double volume(double r,double h);
  }
  public class volume_area implements operation
  {
	  public double area(double r,double h)
	  {
		  return (pi*r*r*h);
	  }
	  public double volume(double r,double h)
	  {
		  return (2*pi*r*r*h);
	  }
	  public static void main(String []args)
	  {
		  volume_area obj=new volume_area();
		  System.out.println("area="+obj.area(4,5));
		  System.out.println("volume="+obj.volume(3,2));
	  }
  }