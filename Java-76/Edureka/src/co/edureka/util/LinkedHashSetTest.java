package co.edureka.util;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> names = new LinkedHashSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Jeffery");
		names.add("Charles");
		names.add("Chris");
		names.add("Praveen");
		System.out.println(names+" | Size = "+ names.size());
	}
}
