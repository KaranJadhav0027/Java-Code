import java.util.*;
public class NA93
{
     void display(int rno)
     {
           System.out.println(" Roll Number = "+rno);
     }
     void display(String name,int m1)
     {
           System.out.println(" Name = "+name);
           System.out.println(" M1 = "+m1);
     }
     void display(int m2,int m3,float per)
     {
          System.out.println(" M2 = "+m2);
          System.out.println(" M3 = "+m3);
          System.out.println(" Percentage = "+per);
     }
     public static void main(String []args)
     {
         NA93 obj=new NA93();
         obj.display(1);
         obj.display("Nalini",89);
         obj.display(89,90,95f);
     }
}