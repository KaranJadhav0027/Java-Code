interface Operation
{
	final double pi=3.142;
	double area(double r,double h);
	double volume(double r,double h);
}
public class Slip5_2 implements Operation
{
	public double area(double r,double h)
	{
		return(pi*r*r*h);
	}
	public double volume(double r,double h)
	{
		return(2*pi*r*r*h);
	}
	public static void main(String []args)
	{
		Slip5_2 obj=new Slip5_2();
		System.out.println("Area of cylinder = "+obj.area(3,5));
		System.out.println("Volume of cylinder = "+obj.volume(5,7));
	}
}