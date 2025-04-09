package Nalini;
import java.util.*;
class Pack_Circle_Area
{
	public static void main(String []args)
	{
		int r;
		final float pi=3.142f;
		float area;
		System.out.println("Enter Radius of the circle : ");
		Scanner scan=new Scanner(System.in);
		r=scan.nextInt();
		area=pi*r*r;
		System.out.println("Area of the circle = "+area);
	}
}