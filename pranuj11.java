import java.util.*;
public class pranuj11
{
public static void main(String args[])
{
HashSet<String>h_set=new HashSet<String>();
h_set.add("Nalini");
h_set.add("Mamta");
h_set.add("Pranoti");
h_set.add("Pooja");
System.out.println("Original HashSet is:"+h_set);
HashSet<String>new_h_set=new HashSet<String>();
new_h_set=(HashSet)h_set.clone();
System.out.println("copy hash set using clone:"+new_h_set);
}
}