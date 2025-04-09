import java.io.*;
class patient
{
	String name;
	int age,oxylvl,hrct;
	patient(String name,int age,int oxylvl,int hrct)
	{
		this.name=name;
		this.age=age;
		this.oxylvl=oxylvl;
		this.hrct=hrct;
	}
}
class Exc_Patient extends Exception
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many patients do you want to chech ?");
		int n=Integer.parseInt(br.readLine());
		patient obj[]=new patient[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name = ");
			String name=br.readLine();
			System.out.println("Enter age = ");
			int age=Integer.parseInt(br.readLine());
			System.out.println("Enter oxygen level = ");
			int oxylvl=Integer.parseInt(br.readLine());
			System.out.println("Enter hrct report = ");
			int hrct=Integer.parseInt(br.readLine());
			obj[i]=new patient(name,age,oxylvl,hrct);
		}
		for(int i=0;i<n;i++)
		{
			if(!(obj[i].oxylvl>95 && obj[i].hrct>10))
			{
				System.out.println("Name="+obj[i].name);
				System.out.println("Age="+obj[i].age);
				try
				{
					throw(new Exception("----"));
				}
				catch(Exception e)
				{
				    System.out.println("Patient is covid positive !!\n need to hospitalized");	
				}
			}
			else
			{
				System.out.println("Name="+obj[i].name);
				System.out.println("age="+obj[i].age);
				System.out.println("oxygen level="+obj[i].oxylvl);
				System.out.println("hrct report="+obj[i].hrct);
				System.out.println("SAFE");
			}
		}
	}
}