import java.io.*;
class clock
{
	static void convertTime(String time)
	{
		String format;
		String arr[]=time.split(":");
		int hh=Integer.parseInt(arr[0]);
		if(hh>12)
		{
			hh=hh-12;
			format="PM";
		}
		else if(hh==0)
		{
			hh=12;
			format="AM";
		}
		else if(hh==12)
		{
			hh=12;
			format="PM";
		}
		else
		{
			format="AM";
		}
		String hr=String.format("%02d",hh);
		String min=arr[1];
		String sec=arr[2];
		System.out.print("Time in 12 - hour format is :");
		System.out.print(hr+":"+min+":"+sec+" "+format);
	}
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter tie in 24-hour format:");
		String time=br.readLine();
		convertTime(time);
	}
}