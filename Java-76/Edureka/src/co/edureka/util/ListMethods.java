package co.edureka.util;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		System.out.println(names+" | Size = "+ names.size());
		
		names.add("Anil");
		names.add("Sunil");
		names.add("Anil");
		names.add("Charles");
		names.add("Steve");
		names.add("Chris");
		names.add("Jefferey");
		names.add("Brea");
		names.add("Anil");		
		
		System.out.println(names+" | Size = "+ names.size());
		names.add(1,"Sanjay");
		names.set(2,"Anirudh");
		System.out.println(names+" | Size = "+ names.size());
		
		System.out.println("Is Anil in List - "+ names.contains("Anil"));
		System.out.println("Is anil in List - "+ names.contains("anil"));
		
		System.out.println("Index of Anil = "+ names.indexOf("Anil"));
		System.out.println("Last Index of Anil = "+ names.lastIndexOf("Anil"));
		System.out.println("Index of anil = "+ names.indexOf("anil")); //-1
		
		System.out.println("Person at index 0 = "+ names.get(0));
		//System.out.println("Person at index 10 = "+ names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("removing object in index 0 = "+ names.remove(0));
		System.out.println("removing Anil from list = "+ names.remove("Anil"));
		System.out.println(names+" | Size = "+ names.size());
	}
}
