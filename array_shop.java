import java.io.*;
public class array_shop
{
    public int ino,price,quantity,amt;
    public String name;
    public void input()throws IOException
    {
         DataInputStream d=new DataInputStream(System.in);
         System.out.println(" Enter item no.,name,price and quantity ");
         ino=Integer.parseInt(d.readLine());
         name=d.readLine();
         price=Integer.parseInt(d.readLine());
         quantity=Integer.parseInt(d.readLine());
    }
    public void display()
    {
        amt=quantity*price;
        System.out.println("    "+ino+"       "+name+"         "+price+"          "+quantity+"           "+amt);
    }
    public static void main(String []args)throws IOException
    {
          int i,n,netamt=0;
          array_shop obj[]=new array_shop[100];
          DataInputStream d=new DataInputStream(System.in);
          System.out.println(" Enter how many items do you want : ");
          n=Integer.parseInt(d.readLine());
          for(i=0;i<n;i++)
          {
               obj[i]=new array_shop();
          }
          for(i=0;i<n;i++)
          {
                 obj[i].input();
          }
          System.out.println(" Item no.   Item name   Price     Quantity    Amount");
          for(i=0;i<n;i++)
          {
                netamt=netamt+obj[i].amt;
                obj[i].display();
          }
          System.out.println("   Net Amount = "+netamt);
    }
}