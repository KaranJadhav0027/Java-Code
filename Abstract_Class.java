import java.util.*;
abstract class base
{
    int rno;
    String name;
    void getdata()
    {
         System.out.println(" Enter student roll number and name ");
         Scanner scan=new Scanner(System.in);
         rno=scan.nextInt();
         name=scan.next();
    }
    void putdata()
    {
         System.out.println(" Roll number = "+rno);
         System.out.println(" Name = "+name);
    }
}
public class Abstract_Class extends base
{
     int m1,m2,m3,total;
     float per;
     void input()
     {
          System.out.println(" Enter marks of the three subjects ");
          Scanner scan=new Scanner(System.in);
          m1=scan.nextInt();
          m2=scan.nextInt();
          m3=scan.nextInt();
     }
     void output()
     {
          total=m1+m2+m3;
          per=total/3;
          System.out.println(" Computer = "+m1);
          System.out.println(" OS = "+m2);
          System.out.println(" Maths = "+m3);
          System.out.println(" Total = "+total);
          System.out.println(" Percentage = "+per);
     }
     public static void main(String []args)
     {
          Abstract_Class obj=new Abstract_Class();
          obj.getdata();
          obj.input();
          obj.putdata();
          obj.output();
     }
}