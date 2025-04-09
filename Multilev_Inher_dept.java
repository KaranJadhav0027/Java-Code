import java.util.*;
class dept
{
    int dno;
    String dname;
}
class emp extends  dept
{
    int eno;
    String ename;
    void getdata()
    {
         System.out.println(" Enter Department no., name and Employee no., name ");
         Scanner scan=new Scanner(System.in);
         dno=scan.nextInt();
         dname=scan.next();
         eno=scan.nextInt();
         ename=scan.next();
    }
    void putdata()
    {
         System.out.println(" Department No. = "+dno);
         System.out.println(" Department Name = "+dname);
         System.out.println(" Employee No. = "+eno);
         System.out.println(" Employee Name = "+ename);
    }
}
class sal extends emp
{
     int sal,netsal,bonus;
     void input()
     {
          System.out.println(" Enter Salary and Bonus of the employee ");
          Scanner scan=new Scanner(System.in);
          sal=scan.nextInt();
          bonus=scan.nextInt();
     }
     void output()
     {
          netsal=sal+bonus;
          System.out.println(" Salary = "+sal);
          System.out.println(" Bonus = "+bonus);
          System.out.println(" Net Salary = "+netsal);
     }
}
public class Multilev_Inher_dept extends sal
{
     public static void main(String []args)
     {
          Multilev_Inher_dept obj=new Multilev_Inher_dept();
          obj.getdata();
          obj.input();
          obj.putdata();
          obj.output();
     }
}