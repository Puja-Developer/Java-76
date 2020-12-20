package co.edureka.util;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();
		
		System.out.println(names.add("Anil")); //true
		System.out.println(names.add("Anil")); //false
		names.add("Jeffery");
		names.add("Charles");
		names.add("Chris");
		names.add("Praveen");
		System.out.println(names+" | Size = "+ names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			System.out.println(name);
		}
		
		names.add(null);
		System.out.println(names);
	}
}
