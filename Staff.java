import java.io.*;
abstract class office
{
	protected int cnt,id;
	String name;
}
class Staff extends office
{
	String dept;
	Staff()
	{
	}
	Staff(int sid,String sname,String dpt)
	{
		id=sid;
		name=sname;
		dept=dpt;
		cnt++;
		System.out.println("object "+cnt+" is created ");
	}
	public String toString()
	{
		return "\n Id = "+id+"\n Name = "+name+"\n Department = "+dept;
	}
	public static void main(String []args)throws IOException
	{
	    int n,i,id;
		String name,dept;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many objects do you want to create:");
		n=Integer.parseInt(br.readLine());
		Staff obj[]=new Staff[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter id : ");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter name : ");
			name=br.readLine();
			System.out.println("Enter department : ");
			dept=br.readLine();
			obj[i]=new Staff(id,name,dept);
		}
		System.out.println("\n-----------------------\n");
		System.out.println("Employee's details are as follows : ");
		for(i=0;i<n;i++)
			System.out.println(obj[i]);
	}
}