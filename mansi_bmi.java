import java.io.*;
class mansi_bmi
{
public static void main(String args[])
{
String a,b;
float w,h,t;
a=args[0];
b=args[1];
w=Float.parseFloat(args[2]);
h=Float.parseFloat(args[3]);
t=w/(h*h);
System.out.println(a+"      "+b);
if(t<18.5)
{
System.out.println("underweight");
}
else if(t>18.5 && t<25)
{
System.out.println("normal");
}
else if(t>25 && t<30)
{
System.out.println("overweight");
}
else
{
System.out.println("obeseery");
}
}
}