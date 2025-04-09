import java.util.*;
class Leap_yr
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any year to check it is Leap or not ..");
		int yr=scan.nextInt();
		if(((yr%4==0)&&(yr%100!=0))||(yr%400==0))
			System.out.println(yr+" is leap year");
		else
			System.out.println(yr+" is not leap year");
	}
}