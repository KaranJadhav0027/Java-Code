import java.util.*;
class empolyee
{
 void display(String ename,int eno)
  {
   System.out.println("\n\tempolyee record");
   System.out.println("\nempolyee name="+ename);
   System.out.println("\nemploy number ="+eno);
  }
}
class student
{
 void display(String sname,int sno)
  {
   System.out.println("\n\tStudent record");
   System.out.println("\nempolyee name="+sname);
   System.out.println("\nemploy number ="+sno);
  }
}
public class MultipleClass
{
	public static void main(String []args)
	{
	  empolyee Eobj=new empolyee();
       Eobj.display("sham",33);
      student Sobj=new student();
       Sobj.display("dhehu",43);	  
	}
}