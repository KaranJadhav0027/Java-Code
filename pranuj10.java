import java.util.*;
import java.util.Iterator;
public class pranuj10
{
public static void main(String args[])
{
HashSet<String>h_set=new HashSet<String>();
h_set.add("Nalini");
h_set.add("Mamta");
h_set.add("Pranoti");
h_set.add("Pooja");
Iterator<String>p=h_set.iterator();
while(p.hasNext())
{
System.out.println(p.next());
}
}
}