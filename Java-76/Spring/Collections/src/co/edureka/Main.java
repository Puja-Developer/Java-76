package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Databases db = (Databases)context.getBean("dbs");
		System.out.println(db);
		
		List<String> dbs = db.getDbNames();
		System.out.println(dbs);
	}
}
