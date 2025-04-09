package student;
public class StudentPer
{
	public int s1,s2,s3,s4,s5,s6;
	public void StudentPer(int m1,int m2,int m3,int m4,int m5,int m6)
	{
		s1=m1;
		s2=m2;
		s3=m3;
		s4=m4;
		s5=m5;
		s6=m6;
	}
	public void display()
	{
		System.out.println("---Marks---");
		System.out.println("m1="+s1);
		System.out.println("m2="+s2);
		System.out.println("m3="+s3);
		System.out.println("m4="+s4);
		System.out.println("m5="+s5);
		System.out.println("m6="+s6);
		int total=s1+s2+s3+s4+s5+s6;
		int per=total/6;
		System.out.println("Percentage = "+per);
	}
}