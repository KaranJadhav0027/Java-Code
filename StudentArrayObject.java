import java.util.*;
public class StudentArrayObject
{
	public int Rnum,m1,m2,m3,total;
	public float per;
	public void getdata()
	{
		System.out.println("\n Enter a Roll number of Student");
		Scanner scan =new Scanner(System.in);
		Rnum=scan.nextInt();
		
		System.out.println("\n Enter a marks of three subject of Student");
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
	}
	public void display()
	{
		 System.out.println("\n\tStudent Imformation");
		total=m1+m2+m3;
		per=total/3;
		System.out.println("\nRoll number of Student = "+Rnum);
        System.out.println("\n 1st subject marks ="+m1);
		System.out.println("\n 2nd subject marks ="+m2);
		System.out.println("\n 3rd subject marks ="+m3);
		System.out.println("\nTotal marks of Student = "+total);
		System.out.println("\npercentage of Student ="+per);
	}
	public static void main(String []args)
	{
		int n,i;
		StudentArrayObject obj[]=new StudentArrayObject[100];
		Scanner scan=new Scanner(System.in);
		System.out.println("\n\t Enter Array Range");
		n=scan.nextInt();
		for(i=0;i<n;i++)
		{
			obj[i]=new StudentArrayObject();
		}
		for(i=0;i<n;i++)
		{
			obj[i].getdata();
		}
		for(i=0;i<n;i++)
		{
			obj[i].display();
		}
	}
}