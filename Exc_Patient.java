//Slip3_2
/*Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information.*/
import java.util.*;
class patient
{
	String P_name;
	int P_age,P_oxylevel,P_HRCT;
	patient(String P_name,int P_age,int P_oxylevel,int P_HRCT)
	{
		this.P_name=P_name;
		this.P_age=P_age;
		this.P_oxylevel=P_oxylevel;
		this.P_HRCT=P_HRCT;
	}
}
class Exc_Patient extends Exception
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("How many patients do you want to check ? ");
		int n=scan.nextInt();
		patient obj[]=new patient[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter patient name :");
			String P_name=scan.next();
			System.out.println("Enter Patient age :");
			int P_age=scan.nextInt();
			System.out.println("Enter Patient Oxygen Level :");
			int P_oxylevel=scan.nextInt();
			System.out.println("Enter Patient HRCT report :");
			int P_HRCT=scan.nextInt();
			obj[i]=new patient(P_name,P_age,P_oxylevel,P_HRCT);
		}
		for(int i=0;i<n;i++)
		{
			if(!(obj[i].P_oxylevel>95 && obj[i]. P_HRCT>10))
			{
				System.out.println("Patient name = "+obj[i].P_name);
				System.out.println("Patient Age = "+obj[i].P_age);
				try
				{
					throw(new Exception("--------"));
				}
				catch(Exception e)
				{
					System.out.println("Patient is covid positive and needs to be hospitalized --");
				}
			}
			else
			{
				System.out.println("Patient name = "+obj[i].P_name);
				System.out.println("Patient Age = "+obj[i].P_age);
				System.out.println("Patient Oxygen Level = "+obj[i].P_oxylevel);
				System.out.println("Patient HRCT report = "+obj[i].P_HRCT);
				System.out.println("Patient is covid negative !!!");
			}
		}
	}
}