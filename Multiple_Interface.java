import java.io.*;
interface college
{
	final String cname="MSG";
	public void display1(int cno,double per);
}
interface bank
{
	final String bname="HDFC";
	public void display2(int no,double bal);
}
public class Multiple_Interface implements college,bank
{
	final String gr="A";
    public void display1(int no,double per)
	{
		System.out.println("\n-------------Student Record in College------------");
		System.out.println(" College No. = "+no);
		System.out.println(" College Name = "+cname);
		System.out.println(" Percentage = "+per);
	}
	public void display2(int no,double bal)
	{
		System.out.println("\n------------Student Record in Bank-----------------");
		System.out.println(" Bank No. = "+no);
		System.out.println(" Bank Name = "+bname);
		System.out.println(" Bank Balance = "+bal);
	}
	
	void show(int no,String name)
	{
		System.out.println("\n-----------Student Record in Sports Club-------------");
		System.out.println(" Sports No. = "+no);
		System.out.println(" Grade = "+gr);
		System.out.println(" Sports Name = "+name);
	}
	public static void main(String []args)
	{
		Multiple_Interface M_obj=new Multiple_Interface();
		M_obj.display1(1,92.20);
		M_obj.display2(101,200000);
		M_obj.show(201,"Atheletics");
	}
}