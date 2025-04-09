//Slip3_2
 /*Write a program for multilevel inheritance such that Country is inherited from Continent. 
 State is inherited from Country. Display the place, State, Country and Continent.*/

import java.io.*;
class continent
{
	String con;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void Input_Continent()throws IOException
	{
		System.out.println("Enter Continent Name : ");
		con=br.readLine();
	}
}
class country extends continent
{
	String cnt;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void Input_Contry()throws IOException
	{
		System.out.println("Enter Country Name : ");
		cnt=br.readLine();
	}
}
class state extends country
{
	String st,plc;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	void Input_State()throws IOException
	{
		System.out.println("Enter State Name : ");
		st=br.readLine();
		System.out.println("Enter Place Name : ");
		plc=br.readLine();
	}
}
public class Slip3_2
{
	public static void main(String []args)throws IOException
	{
		state obj=new state();
		obj.Input_Continent();
		obj.Input_Contry();
		obj.Input_State();
		System.out.println(obj.plc+" belongs from state "+obj.st+" from the country "+obj.cnt+" from "+obj.con+" continent ");
	}
}