import java.io.*;
class BMI
{
	public static void main(String []args)throws IOException
	{
		String first,last;
		float w,h,t;
		first=args[0];
		last=args[1];
		w=Float.parseFloat(args[2]);
		h=Float.parseFloat(args[3]);
		t=w/(h*h);
		System.out.println(first+" "+last);
		if(t<18.5)
			System.out.println("UnderWeight");
		else if(t>=18.5 && t<25)
			System.out.println("Normal");
		else if(t>=25 && t<30)
			System.out.println("OverWeight");
		else
			System.out.println("Obese");
	}
}