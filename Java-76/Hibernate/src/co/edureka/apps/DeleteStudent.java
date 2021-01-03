package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();		
		
		Student st = session.get(Student.class, 111);
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else {
			System.out.println("** No Matching Student Found!");
		}
		
		session.getTransaction().commit();
		session.close();
		sf.close();

	}

}
