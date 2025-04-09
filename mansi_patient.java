import java.io.*;
class covidtest extends Exception
{
String msg;
covidtest(String msg)
{
this.msg=msg;
}
public String toString()
{
return msg;
}
}
public class mansi_patient
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter patient name");
String name=br.readLine();
System.out.println("Enter patient age");
int age=Integer.parseInt(br.readLine());
System.out.println("Enter patient oxygen_level");
int oxy=Integer.parseInt(br.readLine());
System.out.println("Enter patient hrct");
int hrct=Integer.parseInt(br.readLine());
try
{
if(oxy<95)
{
if(hrct>10)
{
throw new covidtest("Patient is covid positive & need to hospitalized");
}
}
else
{
System.out.println("Don't worry no need to hospitalized");
System.out.println("patient name="+name);
System.out.println("patient age="+age);
System.out.println("patient oxygen level="+oxy);
System.out.println("patient hrct="+hrct);
}
}
catch(covidtest c)
{
System.out.println(c);
}
}
}


