import java.io.*;
class employee
{
     public void display(int eno,String name)
     {
           System.out.println("-------Employee Record-------");
           System.out.println(" Employee number = "+eno);
           System.out.println(" Employee Name = "+name);
     }
}
 class student
{
      public void display(int rno,String name)
      {
          System.out.println("----------Student Record----------");
          System.out.println(" Student Roll no. = "+rno);
          System.out.println(" Student Name = "+name);
      }
}
public class MultiClass_emp_stud
{
     public static void main(String []args)
     {
           employee E_obj=new employee();
           E_obj.display(1,"Nalini");
           student S_obj=new student();
           S_obj.display(2,"mamta"); 
     }
}