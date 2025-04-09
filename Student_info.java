import java.util.Scanner;
class Hostel
{
	protected String hnm,hloc;
	int nor;
	void hostelName()
	{
		System.out.println("Name Of the Hostel : " + hnm);
	}
	void hostelLocation()
	{
		System.out.println("Hostel Location : " + hloc);
	}
	void numberOfRoom()
	{
		System.out.println("Total Room : " + nor);
	}
}
class Student extends Hostel 
{
	String snm,regno,elesub,dnm, dhead;
	int avg;
	void studentName()
	{
		System.out.println("Student : " + snm);
	}
	String regNo()
	{
		return regno;
	}
	void electiveSubject()
	{
		System.out.println("Elective Subject : " + elesub);
	}
	void avgMarks()
	{
		System.out.println("Average Marks : " + avg);
	}
	public void DeptName()
	{
		System.out.println("Department Name : " + dnm);
	}
	public void DeptHead()
	{
		System.out.println("Department Head : " + dhead);
	}
	void addStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student name : ");
		snm=sc.nextLine();
		System.out.print("Enter Registration Number : ");
		regno=sc.nextLine();
		System.out.print("Enter Elective Subject : ");
		elesub=sc.nextLine();
		System.out.print("Enter Hostel Name : ");
		hnm=sc.nextLine();
		System.out.print("Enter Hostel Location : ");
		hloc=sc.nextLine();
		System.out.print("Enter Department Name : ");
		dnm=sc.nextLine();
		System.out.print("Enter Department Head : ");
		dhead=sc.nextLine();
		System.out.print("Enter No of room : ");
		nor=sc.nextInt();
		System.out.print("Enter Avg Marks : ");
		avg=sc.nextInt();
	}
	void migrate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter new Department Name : ");
		dnm=sc.nextLine();
		System.out.print("Enter new Department Head : ");
		dhead=sc.nextLine();
	}
	void printData()
	{
		studentName();
		System.out.println(" Student Registration No is : " + regNo());
		electiveSubject();
		avgMarks();
		DeptName();
		DeptHead();
	}
}

class Student_info
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many students ?");
		int n=sc.nextInt();
		Student []st=new Student[n];
		int sno=0;
		String rno;
		int ch;
		boolean b;
		while(true)
		{
			System.out.println("\n 1. Admit a student");
			System.out.println(" 2. Migrate a student");
			System.out.println(" 3. Display");
			System.out.println(" 4. Exit");
			System.out.println(" \n Enter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					st[sno]=new Student();
					st[sno++].addStudent();
					break;
			
				case 2:
					System.out.println("Enter Registration no : ");
					rno=sc.next();
					b=false;
					for(int i=0;i<sno;i++)
					{
						if(st[i].regNo().equals(rno))
						{
							b=true;
							st[0].migrate();
							break;
						}
					}
					if(b==false)
					{
						System.out.println("Student Not Found");
					}
					break;
				
				case 3:
					System.out.println("Enter Registration no : ");
					rno=sc.next();
					b=false;
					for(int i=0;i<sno;i++)
					{
						if(st[i].regNo().equals(rno))
						{
							b=true;
							st[0].printData();
							break;
						}
					}
					if(b==false)
					{
						System.out.println("Student Not Found");
					}
					break;
					
				case 4:
					System.exit(0);
			
				default:
						System.out.println("Wrong choice !");
				}
			}
		}
	}