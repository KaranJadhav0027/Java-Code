import java.io.*;
class acc
{
	private String acno;
	private String name;
	private String actype;
	private long bal;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void openacc()throws IOException
	{
		System.out.println("Enter ac no.:");
		acno=br.readLine();
		System.out.println("Enter ac type :");
		actype=br.readLine();
		System.out.println("Enter name :");
		name=br.readLine();
		System.out.println("Enter balance :");
		bal=Long.parseLong(br.readLine());
	}
	public void showacc()
	{
		System.out.println("acc holder name : "+name);
		System.out.println("Acc no : "+acno);
		System.out.println("Acc type : "+actype);
		System.out.println("Balance : "+bal);
	}
	public void deposit()throws IOException
	{
		long amt;
		System.out.println("Enter amount you want to deposit : ");
		amt=Long.parseLong(br.readLine());
		bal=bal+amt;
	}
	public void withdraw()throws IOException
	{
		long amt;
		System.out.println("Enter amount you want to withdraw : ");
		amt=Long.parseLong(br.readLine());
		if(bal>=amt)
		{
			bal=bal-amt;
			System.out.println("Balance after withdrwal : "+bal);
		}
		else
		{
		    System.out.println("Your balance is less than "+amt+"\t Transaction failed !!!");
		}
	}
	public boolean search(String ac_no)
	{
		if(acno.equals(ac_no))
		{
			showacc();
			return(true);
		}
		return false;
	}
}
public class bank
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many customers do you want to enter : ");
		int n=Integer.parseInt(br.readLine());
		bank b[]=new bank[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new bank();
			b[i].openacc();
		}
		int ch;
		do
		{
			System.out.println("\n banking system application \n");
			System.out.println("1:Display all acc details \n2:Search by acc no \n3:deposit the amount \n4:withdrawthe amount \n5:Exit");
			System.out.println("Enter your choice :");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
				    for(int i=0;i<b.length;i++)
					{
						b[i].showacc();
					}
					break;
				case 2:
				    System.out.println("Enter amount you want to search : ");
					String ac_no=br.readLine();
					boolean found=false;
					for(int i=0;i<b.length;i++)
					{
						found=b[i].search(ac_no);
						if(found)
							break;
					}
					if(!found)
					{
						System.out.println("Search failed !! Account does not exist!!!");
					}
					break;
				case 3:
				    System.out.println("Enter ac no :");
					ac_no=br.readLine();
					found=false;
					for(int i=0;i<b.length;i++)
					{
						found=b[i].search(ac_no);
						if(found)
						{
							b[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Serach failed !! Account does not exist!!!!");
					}
					break;
				case 4:
				    System.out.println("Enter acc no : ");
					ac_no=br.readLine();
					found=false;
					for(int i=0;i<b.length;i++)
					{
						found=b[i].serach(ac_no);
						if(found)
						{
							b[i].withdraw();
							break;
						}
					}
					if(!found)
						System.out.println("Search failed !! Account does not exist!!!!");
					break;
				case 5:
				    System.out.println("see ypu soon ");
					break;
			}
		}
		while(ch!=5);
	}
}