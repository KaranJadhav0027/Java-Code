import java.io.*;
public class Para_const_armstrong
{
     public int n,temp,rem,sum;
     public Para_const_armstrong()
     {
          System.out.println(" Constructor is used ");
          n=153;
     }
     public Para_const_armstrong(int a)
     {
          n=a;
     }
     public void display()
     {
          System.out.println(" n = "+n);
          sum=0;
          temp=n;
          while(n>0)
          {
               rem=n%10;
               sum=sum+(rem*rem*rem);
               n=n/10;
          }
          System.out.println(" Sum = "+sum);
          if(temp==sum)
              System.out.println(" Armstrong Number ");
         else
              System.out.println(" Not Armstrong Number ");
     }
     public static void main(String []args)
     {
           Para_const_armstrong obj1=new Para_const_armstrong();
           obj1.display();
           Para_const_armstrong obj2=new Para_const_armstrong(765);
           obj2.display();
     }
}