package student;
public class studentInfo
{
	public int r_no;
	public String sname;
	public void studentInfo(int roll,String nm)
	{
		r_no=roll;
		sname=nm;
	}
	public void display()
	{
		System.out.println("Roll No. = "+r_no);
		System.out.println("Name = "+sname);
	}
}