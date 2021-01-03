package co.edureka.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.entity.Product;
import co.edureka.utils.HibernateUtils;

public class SaveProduct {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Product product = new Product(102,"Motherboard",550f);
		session.save(product);
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
}
