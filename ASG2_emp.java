//Slip3_1
import java.io.*;
public class ASG2_emp
{
	int id;
	String name;
	String deptname;
	float sal;
	static int nobj=0;
	ASG2_emp()
	{
		id=0;
		name=" ";
		deptname=" ";
		sal=0;
	}
	ASG2_emp(int id,String name,String deptname,float sal)
	{
		this.id=id;
		this.name=name;
		this.deptname=deptname;
		this.sal=sal;
		nobj++;
	}
	public void display()
	{
		System.out.println("Employee ID = "+id);
		System.out.println("Employee name = "+name);
		System.out.println("Employee department name = "+deptname);
		System.out.println("Employee salary = "+sal);
	}
	public static void main(String []args)throws IOException
	{
		int n=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many employees do you want to enter ?");
		n=Integer.parseInt(br.readLine());
		ASG2_emp[] E=new ASG2_emp[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter ID of employee "+(i+1)+":");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Employee name "+(i+1)+":");
			String name=br.readLine();
			System.out.println("Enter Department name of Employee "+(i+1)+":");
			String deptname=br.readLine();
			System.out.println("Enter Salary of Employee "+(i+1)+":");
			float sal=Float.parseFloat(br.readLine());
			E[i]=new ASG2_emp(id,name,deptname,sal);
			System.out.println("Number of objects : "+nobj);
		}
		for(int i=0;i<n;i++)
			E[i].display();
	}
}