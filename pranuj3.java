import java.util.*;
class pranuj3
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.peintln("enter limit of ArrayList:");
int range=scan.nextInt();
ArrayList alist=new ArrayList();
System.out.println("enter elemnts of ArrayList:");
for(int i=0;i<range;i++)
{
String n=scan.next();
alist.add(n);
}
System.out.println("original ArrayList is:"+alist);
Collection.reverse(alist);
System.out.println("Revers of ArrayList is:"+alist);
}
}