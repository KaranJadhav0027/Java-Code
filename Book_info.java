import java.io.*;
import java.util.*;

class Book
{
	String bnm,bid;
	int qty;
	double price,total;

	Book(String i,String n,String p,String q)
	{
		bnm=n;
		bid=i;
		qty=Integer.parseInt(q);
		price=Double.parseDouble(p);
		total=qty*price;
	}

	public String toString()
	{

		String s=bid+" "+bnm+" "+qty+" "+price+" "+total;
		return(s);
	}
	
	public static void search(Book[] arr,int n)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		for(int i=0;i<n;i++)
		{
			if(arr[i].bnm.equals(s))
			{
				System.out.println(arr[i].toString());return;
			}
		}
		System.out.println("No Records Found !");           
	}

	public static void searchBook(Book[] arr,int n)
	{
		double max=0;int c=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i].price > max)
			{
				c=i;
			}
		}
		System.out.println(arr[c].toString());
	}
}

class Book_info
{
	public static void main(String[] args)throws IOException
	{
		String s,space=" ";
		int ch,i;
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter no. of records to enter in file");
		int n=Integer.parseInt(b.readLine());
		
		System.out.println("Enter Records:\n[Book Id] [Book Name] [Book Price] [Book Quantity]");

		File f = new File ("Books.dat");
		RandomAccessFile rf = new RandomAccessFile (f, "rw");
		
		for(i=0;i<n;i++)
		{
			s=b.readLine()+"\n";
			byte bt[]=s.getBytes();
			rf.write(bt);
		}
		rf.close();
		
		Book bk[]=new Book[20];
		RandomAccessFile rf1 = new RandomAccessFile (f, "r");
		for(i=0;i<n;i++)
		{
			s=rf1.readLine();
			StringTokenizer t = new StringTokenizer(s,space);
			String id=new String(t.nextToken());
			String pname=new String(t.nextToken());
			String price=new String(t.nextToken());
			String qty=new String(t.nextToken());
			bk[i]=new Book(id,pname,price,qty);
		}

		do{	
			System.out.println("\nMenu :\n"+"1:Search for a Book by Name\n"+"2:Display all book and total cost\n3:Exit\n"+"Enter your Choice :" );
			ch=Integer.parseInt(b.readLine());
			
			switch (ch) 
			{
				case 1: System.out.println("Enter Book Name to be searched:");
						Book.search(bk,n);
						break;
				case 2: System.out.println("[Book Id] [Book Name] [Book Price] [Book Quantity] [Total]\n");
						for(i=0;i<n;i++)
						System.out.println(bk[i].toString());        
						break;
				case 3: break;
				default:System.out.println("Invalid Option");
			}
		}while(ch!=3);
	}
}