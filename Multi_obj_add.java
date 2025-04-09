import java.io.*;
public class Multi_obj_add
{
      public int a,b,sum;
      public void getdata()throws IOException
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter any two numbers ");
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
      }
      public void display()
      {
            sum=a+b;
            System.out.println(" "+a+" + "+b+" = "+sum);
      }
      public static void main(String []args)throws IOException
      {
          Multi_obj_add obj1=new Multi_obj_add();
          Multi_obj_add obj2=new Multi_obj_add();
          Multi_obj_add obj3=new Multi_obj_add();
          obj1.getdata();
          obj2.getdata();
          obj3.getdata();
          obj1.display();
          obj2.display();
          obj3.display();
      }
}