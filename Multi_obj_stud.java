import java.io.*;
public class Multi_obj_stud
{
     public int rno,m1,m2,m3,total;
     public float per;
     public String name;
     public void getdata()throws IOException
      {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println(" Enter any roll no.,name and marks of the three subjects ");
          rno=Integer.parseInt(br.readLine());
          name=br.readLine();
          m1=Integer.parseInt(br.readLine());
          m2=Integer.parseInt(br.readLine());
          m3=Integer.parseInt(br.readLine());
      }
      public void display()
      {
           total=m1+m2+m3;
           per=total/3;
           System.out.println(" Roll NO. = "+rno);
           System.out.println(" Name = "+name);
           System.out.println(" M1 = "+m1);
           System.out.println(" M2 = "+m2);
           System.out.println(" M3 = "+m3);
           System.out.println(" Total = "+total);
           System.out.println(" Percentage = "+per);
      }
      public static void main(String []args)throws IOException
      {
            Multi_obj_stud obj1=new Multi_obj_stud();
            Multi_obj_stud obj2=new Multi_obj_stud();
            Multi_obj_stud obj3=new Multi_obj_stud();
            obj1.getdata();
            obj2.getdata();
            obj3.getdata();
            obj1.display();
            obj2.display();
            obj3.display();
      }
}