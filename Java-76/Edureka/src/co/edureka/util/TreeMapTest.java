package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,Float> bank = new TreeMap<String,Float>();
		
		System.out.println(bank.put("Sunil",15000f)); //null
		System.out.println(bank.put("Sunil",11500.50f)); //15000.0
		System.out.println(bank.put("Anil",15000f)); //null
		bank.put("Rahul",45000f);
		bank.put("Chris",25500f);
		bank.put("Sujith",12500f);
		
		System.out.println(bank);
	}
}
