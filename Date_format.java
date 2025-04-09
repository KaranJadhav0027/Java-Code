import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Date_format
{
	public static void main(String []args)
	{
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		String strdate=df.format(date);
		System.out.println("Current date is : "+strdate);
		
		df=new SimpleDateFormat("mm-dd-yyyy");
		strdate=df.format(date);
		System.out.println("Current date is "+strdate);
		
		df=new SimpleDateFormat("EEEEEEE MMMM dd yyyy");
		strdate=df.format(date);
		System.out.println("Current date is "+strdate);
		
		df=new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
		strdate=df.format(date);
		System.out.println("Current date is "+strdate);
		
		df=new SimpleDateFormat("dd/mm/yyyy hh:mm:ss a z");
		strdate=df.format(date);
		System.out.println("Current date is "+strdate);
	}
}