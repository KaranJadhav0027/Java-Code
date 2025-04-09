import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormat
{
	public static void main(String []args)
	{
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		String strdate=df.format(date);
		System.out.println("Current Date is : "+strdate);
		
		df=new SimpleDateFormat("MM-dd-yyyy");
		strdate=df.format(date);
		System.out.println("Current Date is : "+strdate);
		
		df=new SimpleDateFormat("EEEEEE MMMM dd yyyy");
		strdate=df.format(date);
		System.out.println("Current Date is : "+strdate);
		
		df=new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
		strdate=df.format(date);
		System.out.println("Current Date and Time is : "+strdate);
		
		df=new SimpleDateFormat("dd/MM/yy HH:mm:ss a z");
		strdate=df.format(date);
		System.out.println("Current Date and Time is : "+strdate);
		
		df=new SimpleDateFormat("hh:mm:ss");
		strdate=df.format(date);
		System.out.println("Current Time is : "+strdate);
		
		df=new SimpleDateFormat("w");
		strdate=df.format(date);
		System.out.println("Current week of the year is : "+strdate);
		
		df=new SimpleDateFormat("W");
		strdate=df.format(date);
		System.out.println("Current week of the month is : "+strdate);
		
		df=new SimpleDateFormat("D");
		strdate=df.format(date);
		System.out.println("Current day of the year is : "+strdate);
	}
}