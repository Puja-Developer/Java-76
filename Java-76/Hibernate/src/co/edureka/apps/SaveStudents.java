package co.edureka.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;

public class SaveStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
	      System.out.println("enter student name, email, mobile:");
	      String name = sc.next();
	      String email = sc.next();
	      String mobile = sc.next();
	      
	      Student st = new Student(name,email,mobile);
	      session.save(st);
	      
	      System.out.print("Do you have more students to save [Y/N]: ");
	      req = sc.next();
		}
		
		System.out.println("----------------------------");
		
		tx.commit();
		
		session.close();
		sf.close();
	}
}
