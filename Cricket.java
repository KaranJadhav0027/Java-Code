import java.io.*;
class player
{
	String name;
	int inning,t_notout,t_runs;
	float avg_bat;
	public player()
	{
		name=null;
		inning=0;
		t_notout=0;
		t_runs=0;
		avg_bat=0;
	}
	public void getdata()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name : ");
		name=br.readLine();
		System.out.println("Enter No.of innings : ");
		inning=Integer.parseInt(br.readLine());
		System.out.println("Enter No. of times not out : ");
		t_notout=Integer.parseInt(br.readLine());
		System.out.println("Enter total runs : ");
		t_runs=Integer.parseInt(br.readLine());
	}
	public void putdata()
	{
		System.out.println("Name = "+name);
		System.out.println("No. of innings = "+inning);
		System.out.println("No. of times not out = "+t_notout);
		System.out.println("Total runs = "+t_runs);
		System.out.println("Bat Average  = "+avg_bat);
	}
	public static void avg(int n,player p[])
	{
		try
		{
			for(int i=0;i<n;i++)
			{
				p[i].avg_bat=p[i].t_runs/p[i].inning;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid!!!");
		}
	}
	public static void sort(int n,player p[])
	{
		String t1;
		int t2,t3,t4;
		float t5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(p[i].avg_bat < p[j].avg_bat)
				{
					t1=p[i].name;
					p[i].name=p[j].name;
					p[j].name=t1;
					
					t2=p[i].inning;
					p[i].inning=p[j].inning;
					p[j].inning=t2;
					
					t3=p[i].t_notout;
					p[i].t_notout=p[j].t_notout;
					p[j].t_notout=t3;
					
					t4=p[i].t_runs;
					p[i].t_runs=p[j].t_runs;
					p[j].t_runs=t4;
					
					t5=p[i].avg_bat;
					p[i].avg_bat=p[j].avg_bat;
					p[j].avg_bat=t5;
				}
			}
		}
	}
}
public class Cricket
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter limit : ");
		int n=Integer.parseInt(br.readLine());
		player p[]=new player[n];
		for(int i=0;i<n;i++)
		{
			p[i]=new player();
			p[i].getdata();
		}
		player.avg(n,p);
	    player.sort(n,p);
		for(int i=0;i<n;i++)
			p[i].putdata();
	}
}