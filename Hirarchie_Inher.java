import java.util.*;
class student
{
     int rno;
     String name;
     void input_student()
     {
            System.out.println("\n Enter Roll no. and name of the student ");
            Scanner scan=new Scanner(System.in);
            rno=scan.nextInt();
            name=scan.next();
     }
     void output_student()
     {
           System.out.println(" Roll no. = "+rno);
           System.out.println(" Name = "+name);
     }
}
class college extends student
{
     String clg_name,clg_addr;
     void input_clg()
     {
           System.out.println("\n Enter college name and address ");
           Scanner scan=new Scanner(System.in);
           clg_name=scan.next();
           clg_addr=scan.next();
     }     
     void output_clg()
     {
           System.out.println(" College name = "+clg_name);
           System.out.println(" Cpllege Address  = "+clg_addr);
     }
}
class club extends student
{
      int cl_no;
      String cl_name;
      void input_cl()
      {
            System.out.println("\n Enter club number and name ");
            Scanner scan=new Scanner(System.in);
            cl_no=scan.nextInt();
            cl_name=scan.next();
      }
      void output_cl()
      {
            System.out.println(" Club number = "+cl_no);
            System.out.println(" Club name = "+cl_name);
      }
}
public class Hirarchie_Inher 
{
      public static void main(String []args)
      {
             college clg=new college();
             clg.input_student();
             clg.input_clg();
             clg.output_student();
             clg.output_clg();

             club cl=new club();
             cl.input_student();
             cl.input_cl();
             cl.output_student();
             cl.output_cl();
      }
}