package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st = new Student();
		System.out.println(st);
		
		try {
			session.load(st, 1025);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		System.out.println(st);
		
		session.close();
		sf.close();
	}
}
