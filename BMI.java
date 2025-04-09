import java.io.*;
public class BMI
{
	public static void main(String []args)throws IOException
	{
		String a,b;
		float w,h,t;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first name,last name,wight and height: ");
		a=br.readLine();
		b=br.readLine();
		w=Float.parseFloat(br.readLine());
		h=Float.parseFloat(br.readLine());
		t=w/(h*h);
		System.out.println(a+" "+b);
		if(t<18.5)
			System.out.println("underwight");
		else if(t>=18.5 && t>25)
			System.out.println("normal");
		else if(t>=25 && t<30)
			System.out.println("oerweight");
		else
			System.out.println("observe");
	}
}