package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt",true); //appending mode
		
		String data = "Edureka is an online training provider with the most effective learning system in the world. We help professionals learn trending technologies for career growth.";
		
		byte[] b = data.getBytes();
		fout.write(b);
		System.out.println("file saved");		
		fout.close();
		
		FileWriter fw = new FileWriter("src/co/edureka/io/edureka_1.txt");
		fw.write(data);
		fw.close();
		System.out.println("file saved");
	}

}
