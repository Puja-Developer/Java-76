package co.edureka.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> data = Arrays.asList(10,20,30,40,50,60,70);
		System.out.println(data);
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(93); marks.add(88); marks.add(79);
		marks.add(95); marks.add(73); marks.add(88);
		
		System.out.println(marks);
		
		listIteration1(marks);
		Thread.sleep(1500);
		
		listIteration2(marks);
		Thread.sleep(1500);
		
		listIteration3(marks);
		Thread.sleep(1500);
		
		listIteration4(marks);
		Thread.sleep(1500);		
		
		listIteration5(marks);
	}
	
	static void listIteration1(List<Integer> marks) {
		System.out.println("1. List iteration using a normal for loop (only for java.util.List)");
		for(int i=0;i<marks.size();i++) {
			Integer n = marks.get(i);
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	
	static void listIteration2(List<Integer> marks) {
		System.out.println("2. List iteration using an enhanced for loop");
		for(Integer n : marks) {			
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}	
	
	static void listIteration3(List<Integer> marks) {
		System.out.println("3. List iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}
	

	static void listIteration4(List<Integer> marks) {
		System.out.println("4. List iteration using java.util.ListIterator - (only for java.util.List)");
		ListIterator<Integer> it = marks.listIterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"   ");
		}
		System.out.println();
		while(it.hasPrevious()) {
			Integer n = it.previous();
			System.out.print(n+"   ");
		}		
		System.out.println("\n");
	}
	
	static void listIteration5(List<Integer> marks) {
		System.out.println("5. List iteration using java.util.Enumeration");
		Enumeration<Integer> en = Collections.enumeration(marks);
		while(en.hasMoreElements()) {
			Integer n = en.nextElement();
			System.out.print(n+"   ");
		}
		System.out.println("\n");
	}		
		
}
