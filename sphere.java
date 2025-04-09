import java.io.*;
public class sphere
{
	public static void main(String []args)throws IOException
	{
		double s_area,vol,r;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius of the sphere :");
        r=Float.parseFloat(br.readLine());
        s_area=4*3.14*(r*r);
        vol=(4/3)*3.14*(r*r*r);
        System.out.println("Surface area of the sphere : "+s_area);
        System.out.println("volume of the sphere : "+vol);
	}	
}