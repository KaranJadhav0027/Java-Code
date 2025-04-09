import java.io.*;
interface student
{
     final String name="Nalini";
     void show(int no,double per);
}
class clg implements student
{
    public void show(int no,double per)
    {
         System.out.println(" Student Record ");
         System.out.println(" Roll No. = "+no);
         System.out.println(" Name = "+name);
         System.out.println(" Percentage = "+per);
    }
}
class bank implements student
{
     public void show(int no,double balance)
     {
          System.out.println(" Student Record in bank ");
          System.out.println(" Bank Balance = "+balance);
          System.out.println(" Name = "+name);
     }
}
public class NA99
{
    public static void main(String []args)
    {
        clg obj=new clg();
        obj.show(1,79.7);
        bank ob=new bank();
        ob.show(2,6000);
    }
}