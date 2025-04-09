import java.util.Scanner;

class CovidTest extends Exception
{
	String msg;
	CovidTest(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
        return msg;
	}
}
 
public class Exc_covid 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Petient Name: ");
		String pnm=s.next();
		System.out.print("Enter Petient Age: ");
		int age=s.nextInt();
		System.out.print("Enter Petient's Oxygen Level: ");
		int oxylvl=s.nextInt();
		System.out.print("Enter Petient's HRCT Score: ");
		int hrct=s.nextInt();
		
		try
		{
			if(oxylvl<95)
			{
				if(hrct>10)
				{
					throw new CovidTest("\n Patient is Covid Positive(+) and need to Hospitalized");
				}
			}
			else
			{
				System.out.println("\nPetient is safe no need to worry !");
				System.out.println("Patient Name : "+pnm);
				System.out.println("Petient Age  : "+age);
				System.out.println("Oxygen Level : "+oxylvl);
				System.out.println("HRCT Score   : "+hrct);
			}
		}
		catch(CovidTest c)
		{
			System.out.println(c);
		}
	}
}