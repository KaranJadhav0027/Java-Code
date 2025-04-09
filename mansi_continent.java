import java.util.*;
class continent
{
String con;
Scanner s=new Scanner(System.in);
void getContinent()
{
System.out.println("Enter Continent name");
con=s.next();
}
}
class country extends continent
{
String cou;
void getCountry()
{
System.out.println("enter country name");
cou=s.next();
}
}
class state extends country
{
String sta;
void getState()
{
System.out.println("enter state name");
sta=s.next();
}
}
class place extends state
{
String pl;
void getPlace()
{
System.out.println("enter place name");
pl=s.next();
}
}
public class mansi_continent
{
public static void main(String args[])
{
place p=new place();
p.getContinent();
p.getCountry();
p.getState();
p.getPlace();
System.out.println("\n "+p.con+"\t"+p.cou+"\t"+p.sta+"\t"+p.pl);
}
}