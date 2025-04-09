import java.io.*;
public class math_operation
 {
	public int num1,num2,sum,sub,mul,div,rem;
    public void input()throws IOException
	{
		DataInputStream d=new DataInputStream(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("\nEnter two Position number");
		num1=Integer.parseInt(d.readLine());
		num2=Integer.parseInt(d.readLine());
	}	
	public void display()
	{
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		rem=num1%num2;
		System.out.println("Addition="+sum);
		System.out.println("Subtraction="+sub);
		System.out.println("Multiplaction="+mul);
		System.out.println("Division="+div);
		System.out.println("Remender="+rem);
	}
public static void main(String []args)throws IOException
    {
		math_operation obj=new math_operation();
		obj.input();
		obj.display();
	}
	}
 