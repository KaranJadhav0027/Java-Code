class stud
{
    public void display1(int rno,double per)
    {
         System.out.println(" Student Record in College ");
         System.out.println(" Roll No. = "+rno);
         System.out.println(" Percentage = "+per);
    }
}
class bank
{
    public void display2(int no,int bal);
    {
         System.out.println(" Student Record in Bank ");
         System.out.println(" Bank no. = "+no);
         System.out.println(" Bank Balance = "+bal); 
    }
}
public class Multiple_Inher_bank extends stud,bank
{
     final String name="Param";
     void show(int no,double per)
     {
          System.out.println("------------Student Record---------- ");
          System.out.println(" Student Roll number = "+no);
          System.out.println(" Percentage = "+per);
          System.out.println(" Name = "+name);
     }
     public static void main(String []args)
     {
          Multiple_Inher_bank obj=new Multiple_Inher_bank();
          obj.display1(1,90);
          obj.display2(101,30000);
          obj.show(20,89.8);
     }
}