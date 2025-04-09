import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class staff
{
     String name,address;
}
class FullTimeStaff extends staff
{
     String dept;
     double sal;
     public void accept()throws IOException
    {
         System.out.println("Enter the name,address,department and salary ");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         name=br.readLine();
         address=br.readLine();
         dept=br.readLine();
         sal=Integer.parseInt(br.readLine());
    }
    public void display()
    {
         System.out.println(" Name = "+name);
         System.out.println(" Address = "+address);
         System.out.println(" Department = "+dept);
         System.out.println(" Salary = "+sal);
         System.out.println("--------------------------------");
    }
}
class PartTimeStaff extends staff
{
       int hour,rate;
       public void accept()throws IOException
       {
            System.out.println(" Enter name,address, No. of working hours and rate");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            name=br.readLine();
            address=br.readLine();
            hour=Integer.parseInt(br.readLine());
            rate=Integer.parseInt(br.readLine());
       }
       public void display()
       {
             System.out.println(" Name = "+name);
             System.out.println(" Address = "+address);
             System.out.println(" Working Hours = "+hour);
             System.out.println(" Rate = "+rate);
       }
}
public class NA91
{
     public static void main(String []args)throws IOException
     {
           int i;
           System.out.println(" Select any one ");
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println(" 1:Full Time Staff ");
           System.out.println(" 2:Part Time Staff ");
           int ch=Integer.parseInt(br.readLine());
           switch(ch)
           {
                 case 1:
                      System.out.println("Enter the number of full time staff ");
                      int n=Integer.parseInt(br.readLine());
                      FullTimeStaff F_obj[]=new FullTimeStaff[n];
                      for(i=0;i<n;i++)
                      {
                            F_obj[i]=new FullTimeStaff();
                            F_obj[i].accept();
                      }
                      for(i=0;i<n;i++)
                      {
                           F_obj[i].display();
                      }
                      break;
                case 2:
                      System.out.println(" Enter the number of part time staff ");
                      int m=Integer.parseInt(br.readLine());
                      PartTimeStaff P_obj[]=new PartTimeStaff[m];
                      for(i=0;i<m;i++)
                      {
                            P_obj[i]=new PartTimeStaff();
                            P_obj[i].accept();
                      }
                      for(i=0;i<m;i++)
                      {
                            P_obj[i].display();
                      }
                      break;
           }
     }
}
