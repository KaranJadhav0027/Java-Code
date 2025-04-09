import java.util.ArrayList;
import java.util.Scanner;
public class ashuprg11
{
public static void main(String args[])
{
ArrayList<String>al=new ArrayList(20);
for(int i=0;i<20;i++)
{
al.add(" "+i);
}
for(int i=0;i<20;i++)
{
System.out.print(" "+al.get(i));
}
}
}
