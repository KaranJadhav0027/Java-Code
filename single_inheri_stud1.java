import java.util.*;
class base
{
     int rno;
     String name;
     void getdata()
     {
           System.out.println(" Enter roll number and name of the student ");
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
public class single_inheri_stud1 extends base
{
     int m1,m2,m3,total;
     float per;
     void read()
     {
          System.out.println(" Enter marks of the three subjects ");
          Scanner scan=new Scanner(System.in);
          m1=scan.nextInt();
          m2=scan.nextInt();
          m3=scan.nextInt();
     }
     void show()
     {
          total=m1+m2+m3;
          per=total/3;
          System.out.println(" Computer = "+m1);
          System.out.println(" Maths = "+m2);
          System.out.println(" OS = "+m3);
          System.out.println(" Total = "+total);
          System.out.println(" Percentage = "+per);
     }
     public static void main(String []args)
     {
          single_inheri_stud1 inheri=new single_inheri_stud1();
          inheri.getdata();
          inheri.read();
          inheri.putdata();
          inheri.show();
     }
}