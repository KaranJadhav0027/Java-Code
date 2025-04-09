package student;
class studentInfo
{
	int rno;
	String name;
	studentInfo(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	void display()
	{
		System.out.println("Roll No. = "+rno);
		System.out.println("Name = "+name);
	}
}