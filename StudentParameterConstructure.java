import java.util.*;
public class StudentParameterConstructure
{
  public int Rnum,m1,m2,m3,total,per;
  public String name;
  
    public void input()
	{
		System.out.println("\n Enter a Roll number of Student");
		Scanner scan =new Scanner(System.in);
		Rnum=scan.nextInt();
		
		System.out.println("\n Enter Student Name");
		name=scan.next();
		
		System.out.println("\n Enter a marks of three subject of Student");
		m1=scan.nextInt();
		m2=scan.nextInt();
		m3=scan.nextInt();
	}
     public StudentParameterConstructure()
   {
	  Rnum=1;
	  name="ashu";
	  m1=35;
	  m2=36;
	  m3=37;
   }
   public StudentParameterConstructure(int Rnum,String name,int m1,int m2, int m3)
   {
	   this.Rnum=Rnum;
	   this.name=name;
	   this.m1=m1;
	   this.m2=m2;
	   this.m3=m3;
   }
   
   public void display()
   {
	   total=m1+m2+m3;
	   per=total/3;
	    System.out.println("\n\tStudent Imformation");
		total=m1+m2+m3;
		per=total/3;
		System.out.println("\nRoll number of Student = "+Rnum);
		System.out.println("\n Name of Student = "+name);
        System.out.println("\n 1st subject marks ="+m1);
		System.out.println("\n 2nd subject marks ="+m2);
		System.out.println("\n 3rd subject marks ="+m3);
		System.out.println("\nTotal marks of Student = "+total);
		System.out.println("\npercentage of Student ="+per);
	}
	public static void main(String args[])
	{
		StudentParameterConstructure obj= new StudentParameterConstructure();
		   obj.input();
		   obj.display();
		StudentParameterConstructure obj1= new StudentParameterConstructure();
		   obj1.display();
		StudentParameterConstructure obj2=new StudentParameterConstructure(3,"karan",66,67,68);
		   obj2.display();
	}
}
