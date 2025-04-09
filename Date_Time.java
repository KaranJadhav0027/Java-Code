import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Date_Time
{
	public static void main(String []args)
	{
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		String strDate=df.format(date);
		System.out.println("Current time is : "+strDate);
		
		df=new SimpleDateFormat("MM-dd-yyyy");
		strDate=df.format(date);
		System.out.println("Current date is : "+strDate);
		
		df=new SimpleDateFormat("EEEEEE MMMM dd yyyy");
		strDate=df.format(date);
		System.out.println("Current date is : "+strDate);
		
		df=new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyyy");
		strDate=df.format(date);
		System.out.println("Current date & time is : "+strDate);
		
		df=new SimpleDateFormat("dd/MM/yy HH:mm:ss a z");
		strDate=df.format(date);
		System.out.println("Current date & time is : "+strDate);
		
		df=new SimpleDateFormat("hh:mm:ss");
		strDate=df.format(date);
		System.out.println("Current time is : "+strDate);
		
		df=new SimpleDateFormat("w");
		strDate=df.format(date);
		System.out.println("Current week of year is : "+strDate);
		
		df=new SimpleDateFormat("W");
		strDate=df.format(date);
		System.out.println("Current week of the month is : "+strDate);
		
		df=new SimpleDateFormat("D");
		strDate=df.format(date);
		System.out.println("Current day of the year is : "+strDate);
	}
}