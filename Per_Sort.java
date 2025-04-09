//Slip2_2,Slip4_2
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class student
{
	int rno;
	String name;
	float per;
	static int count;
	student()
	{
	}
	student(String n,float p)
	{
		count++;
		rno=count;
		name=n;
		per=p;
	}
	void display()
	{
		System.out.println(rno+"\t"+name+"\t"+per);
	}
	float getper()
	{
		return per;
	}
	static void counter()
	{
		System.out.println(count+" object is created ");
	}
	public static void sortstudent(student s[],int n)
	{
		student temp;
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(s[j].getper() < s[j+1].getper())
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			s[i].display();
	}
}
public class Per_Sort
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of students ");
		int n=Integer.parseInt(br.readLine());
		student p[]=new student[n];
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter Rno : ");
			//int rno=Integer.parseInt(br.readLine());
			System.out.println("Enter name : ");
			String name=br.readLine();
			System.out.println("Enter Percentage : ");
			float per=Float.parseFloat(br.readLine());
			p[i]=new student(name,per);
			p[i].counter();
		}
		student.sortstudent(p,student.count);
	}
}