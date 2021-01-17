package co.edureka.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveBook {

	public static void main(String[] args) throws Exception{
		Book book1 = new Book(1013421L, "Spring Boot with Microservices", 450.5f);
		System.out.println(book1);
		
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/book.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(book1);
		System.out.println("Book Saved!");
	}
}
