import java.util.*;
abstract class stud
{
     String record(String name)
     {
           return(name);
     }
     abstract String display(String name);
}
public class Fun_Return_Abstract extends stud
{
      String display(String name)
      {
           return(name);
      }
      public static void main(String []args)
      {
           Fun_Return_Abstract obj=new Fun_Return_Abstract();
           System.out.println(" Name of student = "+obj.record("Nalini"));
           System.out.println(" Name of student = "+obj.display("Pooja"));
      }
}