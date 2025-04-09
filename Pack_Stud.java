package Nalini;
import java.util.*;
public class Pack_Stud
{
	public static void main(String []args)
	{
		int rno,m1,m2,m3,total;
		String name;
		float per;
		System.out.println("Enter Student Roll number , name and marks of the three subjects : ");
		Scanner scan=new Scanner(System.in);
		rno=scan.nextInt();
		name=scan.next();
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
		total=m1+m2+m3;
		per=total/3;
		System.out.println(" Roll Number = "+rno);
		System.out.println(" Name = "+name);
		System.out.println(" Maths = "+m1);
		System.out.println(" OS = "+m2);
		System.out.println(" Computer = "+m3);
		System.out.println(" Total = "+total);
		System.out.println(" Percentage = "+per);
	}
}