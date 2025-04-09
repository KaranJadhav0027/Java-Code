public class Para_const_stud
{
     int rno,m1,m2,m3,total;
     String name;
     float per;
     public Para_const_stud()
     {
          System.out.println(" Constructor is used ");
          rno=1;
          name="Nalini";
          m1=56;
          m2=89;
          m3=98;
     }
     public Para_const_stud(int a,String b,int c,int d,int e)
     {
           rno=a;
           name=b;
           m1=c;
           m2=d;
           m3=e;
     }
     public void display()
     {
          total=m1+m2+m3;
          per=total/3;
          System.out.println("\n Roll no. = "+rno);
          System.out.println(" Name = "+name);
          System.out.println(" M1 = "+m1);
          System.out.println(" M2 = "+m2);
          System.out.println(" M3 = "+m3);
          System.out.println(" Total = "+total);
          System.out.println(" Percentage = "+per);
     }
     public static void main(String []args)
     {
           Para_const_stud obj1=new Para_const_stud();
           obj1.display();
           Para_const_stud obj2=new Para_const_stud(2,"Mamta",78,65,90);
           obj2.display();
     }
}