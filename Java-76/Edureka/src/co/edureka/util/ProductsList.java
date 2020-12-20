package co.edureka.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductsList {

	public static void main(String[] args) {
		List<Product> prod_list = new ArrayList<>();
		
		Product product_1 = new Product(1,"Keyboard", 450f);
		Product product_2 = new Product(2,"Hard Disk", 4250f);
		Product product_3 = new Product(3,"Motherboard", 6500.5f);
		
		prod_list.add(product_1);
		prod_list.add(product_2);
		prod_list.add(product_3);
		
		printProducts(prod_list);
	}

	private static void printProducts(List<Product> products) {
		Iterator<Product> it = products.iterator();
		while(it.hasNext()) {
			Product p = it.next();
			System.out.println(p); //toString()
		}
	}	
	
}
