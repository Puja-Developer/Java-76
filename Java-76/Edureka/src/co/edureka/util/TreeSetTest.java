package co.edureka.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Jeffery");
		names.add("Charles");
		names.add("Chris");
		names.add("Praveen");
		System.out.println(names+" | Size = "+ names.size());
		
		Set<String> names_descending = names.descendingSet();
		System.out.println(names_descending);
		
		//names.add(null);
		System.out.println(names);		
	}

}
