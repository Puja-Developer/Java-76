package co.edureka.util;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDescending {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<>(new MyComparator());
		
		System.out.println(names.add("Anil")); //true	
		names.add("Jeffery");
		names.add("Charles");
		names.add("Chris");
		names.add("Praveen");
		
		System.out.println(names+" | Size = "+ names.size());
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {		
		int n = o1.compareTo(o2);
		
		if(n>0)
			return -1;
		else if(n<0)
			return 1;
		else
			return 0;
	}	
}

