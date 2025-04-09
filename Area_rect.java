import java.io.*;
public class Area_rect
{
	public static void main(String []args)throws IOException
	{
		double length,breadth,area,perimeter;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length and breadth of the rectangle :");
		length=Double.parseDouble(br.readLine());
		breadth=Double.parseDouble(br.readLine());
		area=length*breadth;
		perimeter=2*(length+breadth);
		System.out.println("Area of Rectangle = "+area);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}
}