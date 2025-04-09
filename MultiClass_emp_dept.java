import java.io.*;
class employee
{
    int eno,sal;
    String name;
    public employee()
    {
          System.out.println(" Constructor is used ");
          eno=1;
          name="Nalini";
          sal=70000;
    }
    public void input()throws IOException
    {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println(" Enter Employee no.,name and salary : ");
          eno=Integer.parseInt(br.readLine());
          name=br.readLine();
          sal=Integer.parseInt(br.readLine());
    }
    public void display()
    {
          System.out.println("---------Employee Details----------");
          System.out.println(" Employee no. = "+eno);
          System.out.println(" Employee name = "+name);
          System.out.println(" Salary = "+sal);
    }
}
class dept
{
      int dno;
      String name;
      public dept()
      {
           System.out.println(" Constructor is used ");
           dno=1;
           name="Computer Science";
      }
      public void input()throws IOException
      {
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println(" Enter any department number and name : ");
             dno=Integer.parseInt(br.readLine());
             name=br.readLine();
      } 
      public void display()
      {
           System.out.println("-----------Department Details------------");
           System.out.println(" Dept. no. = "+dno);
           System.out.println(" Dept. Name = "+name);
      }
}
public class MultiClass_emp_dept
{
      public static void main(String []args)throws IOException
      {
           employee E_obj=new employee();
           E_obj.display();
           E_obj.input();
           E_obj.display();
           dept D_obj=new dept();
           D_obj.display();
           D_obj.input();
           D_obj.display();
      }
}