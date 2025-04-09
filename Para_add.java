import java.io.*;
public class Para_add
{
    public int a,b,sum;
    public void input()throws IOException
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println(" Enter any two numbers ");
         a=Integer.parseInt(br.readLine());
         b=Integer.parseInt(br.readLine());
    }
    public void getdata(int x,int y)
    {
        a=x;
        b=y;
    } 
    public void display()
    {
        sum=a+b;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("Sum="+sum);
    }
    public static void main(String []args)throws IOException
    {
        Para_add obj=new Para_add();
        obj.input();
        obj.display();
        obj.getdata(89,54);
        obj.display();
    }
}