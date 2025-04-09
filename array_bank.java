import java.io.*;
public class array_bank
{
   public int cid,bal,dep;
   public float netbal;
   public String cname,bname;
   public void input()throws IOException
   {
       DataInputStream d=new DataInputStream(System.in);
       System.out.println("enter customer ID,customer name,bank name,bank balance and deposit");
       cid=Integer.parseInt(d.readLine());
       cname=d.readLine();
       bname=d.readLine();
       bal=Integer.parseInt(d.readLine());
       dep=Integer.parseInt(d.readLine());
   }
   public void display()
   {
       netbal=bal+dep;
       System.out.println(" Customer ID = "+cid);
       System.out.println(" Customer name = "+cname);
       System.out.println(" Bank name = "+bname);
       System.out.println(" Bank Balance = "+bal);
       System.out.println(" Deposit = "+dep);
       System.out.println(" Net Balance = "+netbal);
   }
   public static void main(String []args)throws IOException
   {
       int i,n;
       array_bank obj[]=new array_bank[100];
       DataInputStream d=new DataInputStream(System.in);
       System.out.println(" enter how many customers details do you want to check : ");
       n=Integer.parseInt(d.readLine());
       for(i=0;i<n;i++)
       {
          obj[i]=new array_bank();
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