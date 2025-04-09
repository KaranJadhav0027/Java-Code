import student.studentInfo;
import student.StudentPer;
import java.io.*;
class Student_details
{
	public static void main(String []args)throws IOException
	{
		String nm;
		int roll;
		int m1,m2,m3,m4,m5,m6;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter roll no : ");
		roll=Integer.parseInt(br.readLine());
		System.out.println("Enter name : ");
		nm=br.readLine();
		System.out.println("Enter marks of 6 subjects : ");
		m1=Integer.parseInt(br.readLine());
		m2=Integer.parseInt(br.readLine());
		m3=Integer.parseInt(br.readLine());
		m4=Integer.parseInt(br.readLine());
		m5=Integer.parseInt(br.readLine());
		m6=Integer.parseInt(br.readLine());
		studentInfo si=new studentInfo(roll,nm);
		si.display();
		StudentPer sp=new StudentPer(m1,m2,m3,m4,m5,m6);
		sp.display();
	}
}