package student;
import java.util.*;
class studentInfo
{
   int rno;
   String name,cls;
   void output()
   {
      System.out.println("Enter Roll number , name , class :");
	  Scanner scan=new Scanner(System.in);
	  rno=scan.nextInt();
	  name=scan.next();
	  cls=scan.next();
	  System.out.println(" Roll Number : "+rno);
	  System.out.println(" Name : "+name);
	  System.out.println(" Class : "+cls);
   }
}
public class studentPer extends studentInfo
{
   public static void main(String []args)
   {
      int m1,m2,m3,total;
	  float per;
      studentPer obj=new studentPer();
	  obj.output();
	  Scanner scan=new Scanner(System.in);
	  System.out.println(" Enter marks of the three subjects : ");
	  m1=scan.nextInt();
	  m2=scan.nextInt();
	  m3=scan.nextInt();
	  total=m1+m2+m3;
	  per=total/3;
	  System.out.println(" m1 : "+m1);
	  System.out.println(" m2 : "+m2);
	  System.out.println(" m3 : "+m3);
	  System.out.println(" Total = "+total);
	  System.out.println(" Percentage = "+per);
   }
}