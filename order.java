import java.io.*;
abstract class customer
{
	String id,desc;
}
class purchase extends customer
{
	String cname,vname;
	public void getdata()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id,description,names of customers and vendors : ");
		id=br.readLine();
		desc=br.readLine();
		cname=br.readLine();
		vname=br.readLine();
	}
	public void putdata()
	{
		System.out.println("ID="+id);
		System.out.println("Description="+desc);
		System.out.println("Customer name="+cname);
		System.out.println("Vendor name="+vname);
		System.out.println("----------------");
	}
}
class sales extends customer
{
	String cname,vname;
	public void getdata()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id,description,names of customers and vendors : ");
		id=br.readLine();
		desc=br.readLine();
		cname=br.readLine();
		vname=br.readLine();
	}
	public void putdata()
	{
		System.out.println("ID="+id);
		System.out.println("Description="+desc);
		System.out.println("Customer name="+cname);
		System.out.println("vendor name="+vname);
		System.out.println("---------------");
	}
}
public class order
{
	public static void main(String []args)throws IOException
	{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1:purchase order");
		System.out.println("2:Sales order");
		System.out.println("Enter your choice :");
		int ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
			    System.out.println("Enter no. of purchase orders:");
				int n=Integer.parseInt(br.readLine());
				purchase p[]=new purchase[n];
				for(i=0;i<n;i++)
				{
					p[i]=new purchase();
					p[i].getdata();
				}
				for(i=0;i<n;i++)
				{
					p[i].putdata();
					System.out.println("object is created");
				}
				break;
			case 2:
			     System.out.println("Enter no. of sales order : ");
				 int m=Integer.parseInt(br.readLine());
				 sales s[]=new sales[m];
				 for(i=0;i<m;i++)
				 {
					 s[i]=new sales();
					 s[i].getdata();
				 }
				 for(i=0;i<m;i++)
				 {
					 s[i].putdata();
					 System.out.println("object is created");
				 }
		}
	}
}