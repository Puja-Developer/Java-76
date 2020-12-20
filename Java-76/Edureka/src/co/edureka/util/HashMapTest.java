package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String,Float> bank = new HashMap<String,Float>();
		
		System.out.println(bank.put("Sunil",15000f)); //null
		System.out.println(bank.put("Sunil",11500.50f)); //15000.0
		System.out.println(bank.put("Anil",15000f)); //null
		bank.put("Rahul",45000f);
		bank.put("Chris",25500f);
		bank.put("Sujith",12500f);
		
		System.out.println(bank);
		System.out.println("--------------------------------");
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of Sunil = "+ bal);
		bal += 1150.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		System.out.println("--------------------------------");
		
		//to get all keys of Map
		System.out.print("A/C Holders  : ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" | ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		
		//to get key and value pairs
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String ac_holder = entry.getKey();
			float balance = entry.getValue();
			System.out.println(ac_holder+" -> "+balance);
		}
		System.out.println("--------------------------------");
	}	
}
