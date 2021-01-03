package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		//---- approach-1 ----
		/*
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","9898989898");
		session.update(st);
		*/
		
		//---- approach-2 ----
		Student st = session.get(Student.class, 102);
		System.out.println(st);
		st.setSname("Anil Kumar"); 
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
