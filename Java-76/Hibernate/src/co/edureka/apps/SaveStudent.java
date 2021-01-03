package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.entity.Student;

public class SaveStudent {
	public static void main(String[] args) {
		// read the details from hibernate.cfg.xml (DOM Parsing)
		Configuration config = new Configuration();
		config.configure("co/edureka/configs/hibernate.cfg.xml");
		
		//create a SessionFcatory instance
		SessionFactory sfactory = config.buildSessionFactory();
		
		//create a Session
		Session session = sfactory.openSession();
		
		//get a Transaction reference
		Transaction tx = session.beginTransaction();
		
		//create a Student object
		Student st = new Student();
		st.setStudid(101);
		st.setSname("Sunil");
		st.setEmail("sunil@hotmail.com");
		st.setMobile("9848586878");
		
		//save the student instance with hibernate
		session.save(st);
		System.out.println("-------------------------------");
		
		//commit the transaction
		tx.commit();
		
		//close the session & sessionfactory
		session.close();
		sfactory.close();
	}
}
