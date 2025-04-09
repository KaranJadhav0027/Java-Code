/*Program for LinkedHashMap */

import java.util.*;
public class LinkHashMap_coll
{
	public static void main(String []args)
	{
		LinkedHashMap lhm=new LinkedHashMap();  //create a linked Hash map
		//put elements to the map
		lhm.put("Nalini", new Double(4534.96));
		lhm.put("Mamta", new Double(300));
		lhm.put("Pranoti",new Double(33.56));
		lhm.put("Ashutosh",new Double(50));
		lhm.put("Karan",new Double(508));
		lhm.put("Pratik",new Double(308));
		//get a set of the entries
		Set set=lhm.entrySet();
		//get an iterator
		Iterator i=set.iterator();
		//display elements
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		//deposit 1000 into pranoti's account
		double balance=((Double)lhm.get("Mamta")).doubleValue();
		lhm.put("Mamta",new Double(balance+1000));
		System.out.println("Mamta's new balance : "+lhm.get("Mamta"));
	}
}