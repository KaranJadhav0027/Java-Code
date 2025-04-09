import java.io.*;
public class array_stud
{
    public int rno,m1,m2,m3,total;
    public String name;
    public float per;
    public void input()throws IOException
    {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println(" Enter any roll no., name and marks of the three subjects ");
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
         System.out.println(" Roll No. = "+rno);
         System.out.println(" Name = "+name);
         System.out.println(" M1 = "+m1);
         System.out.println(" M2 = "+m2);
         System.out.println(" M3 = "+m3);
         System.out.println(" Total = "+total);
         System.out.println(" Percetage = "+per);
    }
    public static void main(String []args)throws IOException
    {
         int i,n;
         array_stud obj[]=new array_stud[100];
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println(" Enter any range ");
         n=Integer.parseInt(br.readLine());
         for(i=0;i<n;i++)
         {
              obj[i]=new array_stud();
         }
         for(i=0;i<n;i++)
         {
             obj[i].input();
         }
         for(i=0;i<n;i++)
         {
              obj[i].display();
         }
    }
}