package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadFromFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
		
		/*
		System.out.println("No of characters to read = "+ fin.available());
		System.out.println((char)fin.read());
		System.out.println(fin.read());
		System.out.println("No of characters to read = "+ fin.available());
		*/
		
		/*
		//to read file contents byte by byte
		int n = fin.read();
		while(n != -1) {
			System.out.print((char)n);
			n = fin.read();
			Thread.sleep(150); //150ms
		}
		*/
		
		/*
		//to read file contents completely
		byte[] b = new byte[fin.available()];
		fin.read(b);
		String str = new String(b);
		System.out.println(str);
		*/
		
		//to read file contents line-by-line
		InputStreamReader sourceFile = new InputStreamReader(fin); //to convert byte stream to character stream
		BufferedReader br = new BufferedReader(sourceFile);
		String line = br.readLine();
		while(line != null) {
			System.out.println(line);
			line = br.readLine();
			Thread.sleep(2000);
		}
		fin.close();
		br.close();
	}
}
