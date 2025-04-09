import java.io.*;
class clg
{
	int cno;
	String cname,caddr;
	clg(int cno,String cname,String caddr)
	{
		this.cno=cno;
		this.cname=cname;
		this.caddr=caddr;
	}
	void display_clg()
	{
		System.out.println("College number="+cno);
		System.out.println("Name="+cname);
		System.out.println("Address="+caddr);
	}
}
class dept extends clg
{
    int dno;
    String dname;
	dept(int a,String b,String c,int dno,String dname)
	{
		super(a,b,c);
		this.dno=dno;
		this.dname=dname;
	}
	void display_dept()
	{
		super.display_clg();
		System.out.println("Dept no="+dno);
		System.out.println("dept name="+dname);
	}
}
class college
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cno,dno;
		String cname,caddr,dname;
		System.out.println("Enter College no : ");
		cno=Integer.parseInt(br.readLine());
		System.out.println("Enter college name : ");
		cname=br.readLine();
		System.out.println("Enter college address : ");
		caddr=br.readLine();
		System.out.println("Enter dept no : ");
		dno=Integer.parseInt(br.readLine());
		System.out.println("Enter Dept name : ");
		dname=br.readLine();
		dept d=new dept(cno,cname,caddr,dno,dname);
		System.out.println("Details are: ");
		d.display_dept();
	}
}