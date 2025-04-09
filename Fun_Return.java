import java.util.*;
class Fun_Return
{
     String display(String name)
     {
           return(name);
     }
     public static void main(String []args)
     {
          Fun_Return obj=new Fun_Return();
          System.out.println(" Name = "+obj.display("Nalini"));
     }
}