import java.io.*;
public class array_rev
{
     public int rev=0,n,rem;
     public void input()throws IOException
     {
          DataInputStream d=new DataInputStream(System.in);
          System.out.println(" Enter any number : ");
          n=Integer.parseInt(d.readLine());
     }
     public void display()
     {
           System.out.print(n+" "); 
            while(n>0)
            {
                  rem=n%10;
                  rev=rev*10+rem;
                  n=n/10;
            }
            System.out.println(" ="+" "+rev);
            
     }
     public static void main(String []args)throws IOException
     {
          int i,n;
          array_rev obj[]=new array_rev[100];
          DataInputStream d=new DataInputStream(System.in);
          System.out.println("Enter how many numbers do you want to check for reverse : ");
          n=Integer.parseInt(d.readLine());
          for(i=0;i<n;i++)
          {
               obj[i]=new array_rev();
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