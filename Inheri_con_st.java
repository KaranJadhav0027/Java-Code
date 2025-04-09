//Inheritances and Interfaces 
import java.io.IOException;
import java.util.Scanner;
class Continent
{
	String con;
	Scanner scan=new Scanner(System.in);
	void getContinent()
	{
		System.out.println("Enter Continent Name : ");
		con=scan.next();
	}
}
class country extends Continent
{
	String cnt;
	void getCountry()
	{
		System.out.println("Enter Country Name : ");
		cnt=scan.next();
	}
}
class state extends country
{
	String st,pl;
	void getState()throws IOException
	{
		System.out.println("Enter State Name : ");
		st=scan.next();
		System.out.println("Enter the place name : ");
		pl=scan.next();
	}
}
public class Inheri_con_st
{
	public static void main(String []args)throws IOException
	{
		state S_obj=new state();
		S_obj.getContinent();
		S_obj.getCountry();
		S_obj.getState();
		System.out.println("\n "+S_obj.pl+" from state "+S_obj.st+" belongs from country "+S_obj.cnt+" of "+S_obj.con+" Continent");
	}
}