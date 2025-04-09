import java.util.*;
class clg
{
    int cno;
    String cname;
}
class teacher extends clg
{
    int T_sal;
    String T_name,T_sub;
    void getdata()
    {
        System.out.println(" Enter College number,name and Teacher name,subject and salary ");
        Scanner scan=new Scanner(System.in);
        cno=scan.nextInt();
        cname=scan.next();
        T_name=scan.next();
        T_sub=scan.next();
        T_sal=scan.nextInt(); 
    }
    void putdata()
    {
        System.out.println(" College Number = "+cno);
        System.out.println(" College Name = "+cname);
        System.out.println(" Teacher name = "+T_name);
        System.out.println(" Teacher Subject = "+T_sub);
        System.out.println(" Teacher Salary = "+T_sal);
    }
}
class stud extends teacher
{
     int rno;
     float per;
     String name;
     void input()
     {
          System.out.println(" Enter Student Roll Number,Name and Percentage ");
          Scanner scan=new Scanner(System.in);
          rno=scan.nextInt();
          name=scan.next();
          per=scan.nextFloat();
     }
     void output()
     {
          System.out.println(" Roll number = "+rno);
          System.out.println(" Name = "+name);
          System.out.println(" Percentage = "+per);
     }
}
public class Multilev_Inher_Clg
{
     public static void main(String []args)
     {
          stud obj=new stud();
          obj.getdata();
          obj.input();
          obj.putdata();
          obj.output();
     }
}